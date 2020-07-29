package com.putnam.demo.files_demo.persistence;

import com.putnam.demo.files_demo.domain.FundFile;
import com.putnam.demo.files_demo.persistence.svcs.FundFileData;
import com.putnam.demo.files_demo.persistence.svcs.FundFileService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FundFileServiceTests {
    private FundFileRepository mockedFundRepository;
    private FundFileData fundSvc;

    @BeforeEach
    public void setUpFixtures() {
        this.mockedFundRepository = mock(FundFileRepository.class);
        when(this.mockedFundRepository.getReceivedFilesForToday()).thenReturn(Optional.of(Arrays.asList(
                new FundFile("spendy_avenue.csv", LocalTime.now()),
                new FundFile("thrift_avenue.csv", LocalTime.now())
        )));

        this.fundSvc = new FundFileService(this.mockedFundRepository);

    }

    @Test
    void getFundFilesForDayPositiveDataTest(){
        Optional<List<FundFile>> rtnValue = this.fundSvc.getFundFilesForDay();
        assertTrue(rtnValue.isPresent(),"fund service failed to return list of fund files for day");

        assertTrue(rtnValue.get().size() >= 1, "fund file service failed to return populated list");

    }


}
