package com.putnam.demo.files_demo.persistence.svcs;

import com.putnam.demo.files_demo.domain.FundFile;

import java.util.List;
import java.util.Optional;

public interface FundFileData {
    Optional<List<FundFile>> getFundFilesForDay();
    FundFile reportNewFundFileReceived(FundFile revcdFile);
}
