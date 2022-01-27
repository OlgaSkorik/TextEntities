package com.company.word_processing;

public interface TextProcessable {

    default void processText(StringBuilder input) {
    }
}