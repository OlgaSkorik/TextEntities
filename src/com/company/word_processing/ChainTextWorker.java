package com.company.word_processing;

public class ChainTextWorker implements TextProcessable {
    TextProcessable[] processes;

    public ChainTextWorker(TextProcessable[] processes) {
        this.processes = processes;
    }

    public String[] processText(String[] texts) {
            for (int i = 0; i < texts.length; i++) {
                texts[i] = processText(texts[i]);
            }
        return texts;
    }

    private String processText(String text) {
        StringBuilder input = new StringBuilder(text);
            for (int i = 0; i < processes.length; i++) {
                try {
                processes[i].processText(input);
            } catch (UnsupportedOperationException e) {
                }
        }
        return input.toString();
    }
}
