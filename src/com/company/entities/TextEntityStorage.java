package com.company.entities;

import com.company.entities.TextEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextEntityStorage implements Serializable {
    private TextEntity[] textEntities;

//    public TextEntityStorage(TextEntity[] textEntities) {
//        this.textEntities = textEntities;
//    }

    @Override
    public String toString() {
        return "TextEntityStorage{" +
                "textEntities=" + textEntities +
                '}';
    }

//    public TextEntity[] getTextEntities() {
//        return textEntities;
//    }
}
