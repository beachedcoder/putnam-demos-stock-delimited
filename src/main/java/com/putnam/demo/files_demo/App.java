package com.putnam.demo.files_demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import com.putnam.demo.files_demo.domain.Stock;
import com.putnam.demo.files_demo.reader.StocksFileReader;
import com.putnam.demo.files_demo.reader.FileReaderFactory;

/**
 * Reading files using streams!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Stock file reading!" );
        
        String currentFile = "MOCK_DATA.csv";
        
        StocksFileReader iStockReader = null;
        List<Stock> currentStockList = null;
		try {
			
			iStockReader = FileReaderFactory.getStocksFile(currentFile);
			
			if(iStockReader.getStocks().isPresent()) {
				currentStockList = iStockReader.getStocks().get();
			};
			
			
			
			
		} catch (IllegalArgumentException | FileNotFoundException | URISyntaxException e) {
			// TODO Auto-generated catch block
			//log file path source failures @work
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//log reason for fetching from file @work
			e.printStackTrace();
		}
        
        
        
//        currentStockList.forEach(s -> System.out.println("As found on TV>> "+s));
        
        Double averageTradeValue = currentStockList.stream().collect(Collectors.averagingDouble(s -> s.getTradedAt()));
        
        System.out.println("Average stock trade price is:: $"+averageTradeValue);
        
        
        
    }
}
