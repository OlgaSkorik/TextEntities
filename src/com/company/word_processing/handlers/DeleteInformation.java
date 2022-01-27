package com.company.word_processing.handlers;

import com.company.word_processing.TextProcessable;

public class DeleteInformation implements TextProcessable {
    int indexStart;
    int indexEnd;

    public DeleteInformation(int indexStart, int indexEnd) {
        this.indexStart = indexStart;
        this.indexEnd = indexEnd;
    }

    @Override
    public void processText(StringBuilder input) {
        input.delete(indexStart,indexEnd);
    }
}