package com.company.word_processing.handlers;

import com.company.word_processing.TextProcessable;

public class ReverseInformation implements TextProcessable {

    public ReverseInformation() {
    }

    @Override
    public void processText(StringBuilder input) {
        input.reverse();
    }
}