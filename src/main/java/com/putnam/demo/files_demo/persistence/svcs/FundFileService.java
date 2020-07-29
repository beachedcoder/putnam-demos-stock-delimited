package com.putnam.demo.files_demo.persistence.svcs;

import com.putnam.demo.files_demo.domain.FundFile;
import com.putnam.demo.files_demo.persistence.FundFileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FundFileService implements FundFileData{

    private final FundFileRepository fileRepo;

    public FundFileService(FundFileRepository fileRepo) {
        this.fileRepo = fileRepo;
    }

    @Override
    public Optional<List<FundFile>> getFundFilesForDay() {
        return fileRepo.getReceivedFilesForToday();
    }

    @Override
    public FundFile reportNewFundFileReceived(FundFile revcdFile) {
        return null;
    }
}
