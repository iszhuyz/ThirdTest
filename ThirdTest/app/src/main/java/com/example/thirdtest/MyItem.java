package com.example.thirdtest;

import java.io.Serializable;

public class MyItem implements Serializable{

    private String nameString;
    private boolean chick;   //标识

    public MyItem(String nameString) {
        this.nameString = nameString;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public boolean isChick() {
        return chick;
    }

    public void setChick(boolean chick) {
        this.chick = chick;
    }

}
