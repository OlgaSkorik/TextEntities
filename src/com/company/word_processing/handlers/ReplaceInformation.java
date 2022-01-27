package com.company.word_processing.handlers;

import com.company.word_processing.TextProcessable;

public class ReplaceInformation implements TextProcessable {
    String objToReplace;
    int indexToReplaceStart;
    int indexToReplaceEnd;

    public ReplaceInformation(String objToReplace, int indexToReplaceStart, int indexToReplaceEnd) {
        this.objToReplace = objToReplace;
        this.indexToReplaceStart = indexToReplaceStart;
        this.indexToReplaceEnd = indexToReplaceEnd;
    }

    @Override
    public void processText(StringBuilder input) {
        input.replace(indexToReplaceStart,indexToReplaceEnd,objToReplace);
    }
}