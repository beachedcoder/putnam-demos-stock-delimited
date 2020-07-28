package com.putnam.demo.files_demo.persistence;

import com.putnam.demo.files_demo.domain.FundFile;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FundFilePersistenceTests {
    private FundFileRepository mockedFundRepository;

    @BeforeEach
    public void setUpFixtures() {
        this.mockedFundRepository = mock(FundFileRepository.class);
        when(this.mockedFundRepository.getReceivedFileForToday()).thenReturn(Optional.of(Arrays.asList(
                new FundFile("spendy_avenue.csv", LocalTime.now()),
                new FundFile("thrift_avenue.csv", LocalTime.now())
        )));
    }


}
