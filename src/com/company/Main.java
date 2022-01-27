package com.company;

import com.company.file_conversion.FileConversion;

public class Main {

    public static void main(String[] args) {
        FileConversion.processFile("store/file1.txt", "store/file2.txt");
    }
}
