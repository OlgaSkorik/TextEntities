package com.company.file_conversion;

import com.company.entities.TextEntity;
import com.company.exception.SerialNumberException;
import com.company.word_processing.ChainTextWorker;
import com.company.word_processing.TextProcessable;
import com.company.word_processing.handlers.ReverseInformation;
import com.company.word_processing.handlers.StubTextProcessable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class FileConversion {

    public static void processFile(String fileNameInput, String fileNameOutput) {
        TextEntity[] textEntities = new TextEntity[]{new TextEntity(),new TextEntity(),new TextEntity()};
        System.out.println(Arrays.toString(textEntities));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileNameInput);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(textEntities);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        FileWorker fileWorker = new FileWorker();
        try {
            fileWorker.readTextEntityStorage(fileNameInput);
        } catch (SerialNumberException e) {
            e.getStackTrace();
        }
        Arrays.sort(textEntities);
        System.out.println(Arrays.toString(textEntities));
        String[] texts = new String[textEntities.length];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = textEntities[i].getText();
        }
        System.out.println(Arrays.toString(texts));
        ChainTextWorker worker = new ChainTextWorker(new TextProcessable[] {new StubTextProcessable(), new ReverseInformation()});
        String[] res = worker.processText(texts);
        for (int i = 0; i < res.length; i++) {
            res[i] = res[i].concat(" ");
            System.out.print(res[i]);
        }
        FileWorker.writeTexts(res, fileNameOutput);
    }
}
