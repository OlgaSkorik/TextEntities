package com.company.word_processing.handlers;

import com.company.word_processing.TextProcessable;

public class StubTextProcessable implements TextProcessable {
    @Override
    public void processText(StringBuilder input) {
        throw new UnsupportedOperationException("This method is not ready.");
    }
}
