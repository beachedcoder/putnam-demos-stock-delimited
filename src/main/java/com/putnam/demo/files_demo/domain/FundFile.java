package com.putnam.demo.files_demo.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;
import java.util.Objects;

public class FundFile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String physicalFileName;
    private LocalTime receiptTimeStamp;

    public FundFile() {
    }

    public FundFile(String physicalFileName, LocalTime receiptTimeStamp) {
        this();
        if (physicalFileName != null) {
            this.physicalFileName = physicalFileName;
        } else {
            throw new IllegalArgumentException("file path was not provide for fund file creation");
        }
        this.receiptTimeStamp = receiptTimeStamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhysicalFileName() {
        return physicalFileName;
    }

    public void setPhysicalFileName(String physicalFileName) {
        this.physicalFileName = physicalFileName;
    }

    public LocalTime getReceiptTimeStamp() {
        return receiptTimeStamp;
    }

    public void setReceiptTimeStamp(LocalTime receiptTimeStamp) {
        this.receiptTimeStamp = receiptTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FundFile)) return false;
        FundFile fundFile = (FundFile) o;
        return getId() == fundFile.getId() &&
                getPhysicalFileName().equals(fundFile.getPhysicalFileName()) &&
                getReceiptTimeStamp().equals(fundFile.getReceiptTimeStamp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPhysicalFileName(), getReceiptTimeStamp());
    }
}
