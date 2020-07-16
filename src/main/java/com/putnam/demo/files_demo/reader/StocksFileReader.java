package com.putnam.demo.files_demo.reader;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.putnam.demo.files_demo.domain.Stock;

public interface StocksFileReader {
	
	Optional<List<Stock>> getStocks() throws IOException;
	default Optional<List<Stock>> getTopStocks(){
		return Optional.of(null);
	}
}
