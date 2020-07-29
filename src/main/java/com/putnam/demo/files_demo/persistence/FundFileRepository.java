package com.putnam.demo.files_demo.persistence;

import com.putnam.demo.files_demo.domain.FundFile;

import java.util.List;
import java.util.Optional;

public interface FundFileRepository {

    FundFile recordReceivedFile(FundFile recvdInformation);

    Optional<FundFile> findPreviouslyReceivedFile(long fileId);

    Optional<List<FundFile>> getReceivedFilesForToday();


}
