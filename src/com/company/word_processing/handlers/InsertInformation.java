package com.company.word_processing.handlers;

import com.company.word_processing.TextProcessable;

public class InsertInformation implements TextProcessable {
    int index;
    String str;

    public InsertInformation(int index, String str) {
        this.index = index;
        this.str = str;
    }

    @Override
    public void processText(StringBuilder input) {
        input.insert(index,str);
    }
}