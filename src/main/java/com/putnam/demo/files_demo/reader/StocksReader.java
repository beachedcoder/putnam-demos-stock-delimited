package com.putnam.demo.files_demo.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.putnam.demo.files_demo.domain.Stock;

public class StocksReader implements StocksFileReader{
	/**
	 * open file for reading
	 * read each line of file storing the data
	 * convert into Stock instance
	 */
	
	private Path filePath;
	private Stream<String> linesOfFile;
	
	
	public StocksReader(Path filePath) throws IllegalArgumentException {
		super();
		if(filePath == null) {
			throw new IllegalArgumentException("Unable to process null stock file reference");
		}
		this.filePath = filePath;
	}
	
	private void buildStreamSource() throws IOException {
		this.linesOfFile = Files.lines(this.filePath);
	}

	@Override
	public Optional<List<Stock>> getStocks() throws IOException {
		buildStreamSource();
		
		return Optional.of( linesOfFile
				.map(fileLine -> {			
			Pattern regPattern = Pattern.compile("^([\\w\\W\\^]*),(\"[\\w\\s,\\.&'-\\(\\)/]*\"|[\\w\\s,\\(\\)\\.&'-/]*),(\\w+),(\\$[\\w\\.]+|n/a),\\$([\\d\\.]+),([\\w\\s-]+|n/a)$");
			Matcher lineMatcher = regPattern.matcher(fileLine);
			if (lineMatcher.lookingAt()) {
				System.out.println(String.format("found matches  %s %s %s %s %s %s",lineMatcher.group(1),lineMatcher.group(2),lineMatcher.group(3),lineMatcher.group(4)
						,lineMatcher.group(5),lineMatcher.group(6)));
			}else {
				System.out.println(String.format("un-matched line>> %s", fileLine));
				return new Stock();
			}
			
			return new Stock(lineMatcher.group(1),lineMatcher.group(2),lineMatcher.group(3),lineMatcher.group(4),lineMatcher.group(5),lineMatcher.group(6));
		})
		.collect(Collectors.toList()));
	}
	


}
