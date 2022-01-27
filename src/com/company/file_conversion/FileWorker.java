package com.company.file_conversion;

import com.company.entities.TextEntity;
import com.company.entities.TextEntityStorage;
import com.company.exception.SerialNumberException;

import java.io.*;

public class FileWorker {

    public TextEntityStorage readTextEntityStorage (String fileName) throws SerialNumberException {
        TextEntity[] readObject = null;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            readObject = (TextEntity[]) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (TextEntity textEntity : readObject) {
            if (textEntity.getSerialNumber() < 0) {
                throw new SerialNumberException("Serial number cannot be negative.");
            }
        }
        return new TextEntityStorage();
    }

    public static void writeTexts (String[] texts, String fileName) {
        try (FileWriter writer = new FileWriter (fileName)) {
            for (String text : texts) {
                writer.write(text);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
