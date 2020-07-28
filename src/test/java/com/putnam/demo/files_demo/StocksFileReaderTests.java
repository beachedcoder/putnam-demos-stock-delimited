package com.putnam.demo.files_demo;

import static org.junit.jupiter.api.Assertions.*;
import com.putnam.demo.files_demo.domain.Stock;
import com.putnam.demo.files_demo.reader.FileReaderFactory;
import com.putnam.demo.files_demo.reader.StocksReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;

public class StocksFileReaderTests {

    private static ClassLoader currentClassContext;

    private Path getFilePathResource(String fpResource) throws URISyntaxException {
        return Paths.get((currentClassContext.getResource(fpResource)).toURI());
    }
    @BeforeAll
    public static void setupClassLoaderForAllTests(){
        //get class path context to enable file loading from resources
        ClassLoader classLoader = (new StocksFileReaderTests()).getClass().getClassLoader();
    }

    @Test
    public void constructorThrowsExceptionForNullPath(){
        assertThrows(IllegalArgumentException.class, () -> new StocksReader(null) );
    }

    @Test
    public void badDataLinesInFileResultingInUnmatchedRecords() throws URISyntaxException {
        //fetch class path resource
        Path currentResource = getFilePathResource("");

    }


}
