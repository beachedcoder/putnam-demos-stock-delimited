package com.putnam.demo.files_demo.domain;

import java.util.regex.Pattern;

public interface FileDataSource {
    boolean isProvider(String fileName);
    Pattern getDataLinePattern();
}
