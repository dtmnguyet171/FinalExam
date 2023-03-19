package com.vti.frontend;

import com.vti.utils.FileUtils;

import javax.xml.crypto.Data;

public class DemoFile {
    public static void main(String[] args) {
//        FileUtils.checkFileExists("Data/demo.txt");
//        FileUtils.createFile("demo.txt");
//        FileUtils.deleteFile("Data/demo.txt");
//        FileUtils.getAllFile("Data");
        FileUtils.readFile("Data/demo.txt");
    }
}
