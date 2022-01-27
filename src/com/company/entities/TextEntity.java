package com.company.entities;

import java.io.Serializable;
import java.util.Random;

public class TextEntity implements Serializable, Comparable<TextEntity> {

    private int serialNumber;
    private String text;

    public TextEntity() {
        Random random = new Random();
        serialNumber = random.nextInt(4)+1;
        int a = random.nextInt(4)+1;
        switch (a) {
            case 1:
                text = "firstText";
                break;
            case 2:
                text = "secondText";
                break;
            case 3:
                text = "thirdText";
                break;
            case 4:
                text = "fourthText";
                break;
        }
    }

    @Override
    public String toString() {
        return "{" + serialNumber +
                ", " + text + '}';
    }

    @Override
    public int compareTo(TextEntity textEntity) {
        return this.serialNumber - textEntity.serialNumber;
    }

    public String getText() {
        return text;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
