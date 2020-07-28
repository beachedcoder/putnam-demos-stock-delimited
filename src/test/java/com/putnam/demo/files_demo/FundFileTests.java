package com.putnam.demo.files_demo;

import com.putnam.demo.files_demo.domain.FundFile;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FundFileTests {

    private FundFile instanceUnderTest;

    @BeforeEach
    public void setup() {

    }

    @AfterEach
    public void cleanup() {

    }

    @Test
    public void constructorIllegalArgumentForBadPhysicalFilePath() {
        String badFilePath = null;
        assertThrows(IllegalArgumentException.class, () -> new FundFile(badFilePath, LocalTime.now()));
    }

    @Test
    public void constructorThrowsIllegalArgumentForBadCharactersInFilePath() {
        // what characters are not allowed in file path?  << expressed as regular expression

    }

}
