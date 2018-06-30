package com.test.platform.model.config;


public class FileBean {
    private static String filePath;

    public static String getFilePath() {
        return filePath;
    }

    public static void setFilePath(String path) {
        FileBean.filePath = path;
    }

}
