package com.putnam.demo.files_demo.domain;

import java.util.regex.Pattern;

public enum FileProvider implements FileDataSource{
    STATE_STREET {
        @Override
        public boolean isProvider(String fileName) {
            return fileName.contains("state_street");
        }

        @Override
        public Pattern getDataLinePattern() {
            return Pattern.compile("^([\\w\\W\\^]*),(\"[\\w\\s,\\.&'-\\(\\)/]*\"|[\\w\\s,\\(\\)\\.&'-/]*),(\\w+),(\\$[\\w\\.]+|n/a),\\$([\\d\\.]+),([\\w\\s-]+|n/a)$");
        }

        @Override
        public String toString() {
            return "State_Street";
        }
    }, MELON{
        @Override
        public boolean isProvider(String fileName) {
            return fileName.contains("melon");
        }

        @Override
        public Pattern getDataLinePattern() {
            return Pattern.compile("^([\\w\\W\\^]*),(\"[\\w\\s,\\.&'-\\(\\)/]*\"|[\\w\\s,\\(\\)\\.&'-/]*),(\\w+),(\\$[\\w\\.]+|n/a),\\$([\\d\\.]+),([\\w\\s-]+|n/a)$");
        }

        @Override
        public String toString() {
            return "Melon";
        }
    }, IFS{
        @Override
        public boolean isProvider(String fileName) {
            return fileName.contains("ifs");
        }

        @Override
        public Pattern getDataLinePattern() {
            return Pattern.compile("^([\\w\\W\\^]*),(\"[\\w\\s,\\.&'-\\(\\)/]*\"|[\\w\\s,\\(\\)\\.&'-/]*),(\\w+),(\\$[\\w\\.]+|n/a),\\$([\\d\\.]+),([\\w\\s-]+|n/a)$");
        }

        @Override
        public String toString() {
            return "Ifs";
        }
    }, PANAGORA{
        @Override
        public boolean isProvider(String fileName) {
            return fileName.contains("pana_gora");
        }

        @Override
        public Pattern getDataLinePattern() {
            return Pattern.compile("^([\\w\\W\\^]*),(\"[\\w\\s,\\.&'-\\(\\)/]*\"|[\\w\\s,\\(\\)\\.&'-/]*),(\\w+),(\\$[\\w\\.]+|n/a),\\$([\\d\\.]+),([\\w\\s-]+|n/a)$");
        }

        @Override
        public String toString() {
            return "Panagora";
        }
    },
    AMAZON {
        @Override
        public String toString() {
            return "Amazon";
        }

        @Override
        public boolean isProvider(String fileName) {
            return fileName.contains("amazon.com");
        }

        @Override
        public Pattern getDataLinePattern() {
            return Pattern.compile("^([\\w\\W\\^]*),(\"[\\w\\s,\\.&'-\\(\\)/]*\"|[\\w\\s,\\(\\)\\.&'-/]*),(\\w+),(\\$[\\w\\.]+|n/a),\\$([\\d\\.]+),([\\w\\s-]+|n/a)$");
        }
    }
}
