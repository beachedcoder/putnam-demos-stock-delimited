package com.putnam.demo.files_demo;

import com.putnam.demo.files_demo.reader.StocksReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class StocksFileReaderTests {


    private static String resourcesLocation;

    @BeforeAll
    public static void setupClassLoaderForAllTests() {
        resourcesLocation = Paths.get("src", "test", "resources").toFile().getAbsolutePath();
        System.out.println(resourcesLocation);
    }

    private Path getFilePathResource(String fpResource) {
        return Paths.get(resourcesLocation, fpResource);
    }

    @Test
    public void fetchFileFromTestResourcesDirectory() throws IOException {
        Path rtnValue = getFilePathResource("first_!bad_records.txt");
        assertNotNull(rtnValue);
        assertNotNull(Files.lines(rtnValue));
    }


    @Test
    public void constructorThrowsExceptionForNullPath() {
        assertThrows(IllegalArgumentException.class, () -> new StocksReader(null));
    }

    @Test
    public void constructorThrowsIllegalArgumentExceptionForBadCharactersInFilePath() {
        assertAll("bad characters in file path",
                () -> assertThrows(IllegalArgumentException.class, () -> new StocksReader(getFilePathResource("first_!bad_records.txt")),
                        "exclaimation in file name"),
                () -> assertThrows(IllegalArgumentException.class, () -> new StocksReader(getFilePathResource("second%_bad_records.txt")),
                        "percent sign in file name"),
                () -> assertThrows(IllegalArgumentException.class, () -> new StocksReader(getFilePathResource("bad_file_extension.xlsx")),
                        "bad file extension on file name"),
                () -> assertThrows(IllegalArgumentException.class, () -> new StocksReader(getFilePathResource("bad-file_extension.csv")),
                        "bad dash character in file name")
        );
    }

    @Disabled
    @Test
    public void badDataLinesInFileResultingInUnmatchedRecords() {
        //fetch class path resource
        Path currentResource = getFilePathResource("");

    }


}
