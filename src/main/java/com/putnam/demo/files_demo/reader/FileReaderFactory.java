package com.putnam.demo.files_demo.reader;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class FileReaderFactory {
	
	public static StocksFileReader getStocksFile(String filePath) throws IllegalArgumentException, FileNotFoundException, URISyntaxException {

		if(filePath == null || filePath.isBlank()) {
			throw new IllegalArgumentException("Missing or empty file path is not allowed");
		}
		
		ClassLoader classLoader = (new FileReaderFactory()).getClass().getClassLoader();
		
		URL resourceFound = classLoader.getResource(filePath);
		
		if(resourceFound == null) {
			throw new FileNotFoundException("Unable to locate ["+filePath + "] requested file for processing"); 
		}
		
		return new StocksReader(Paths.get(resourceFound.toURI()));
	}

}
