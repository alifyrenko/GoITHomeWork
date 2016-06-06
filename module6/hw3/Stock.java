package com.goit.gojavaonline.module6.hw3;

import java.util.Set;

/**
 * Created by ANTON on 01.06.2016.
 */
public class Stock {
    private int guitarCount;
    private int pianoCount;
    private int trumpetCount;

    public Stock(int guitarCount, int pianoCount, int trumpetCount) {
        this.guitarCount = guitarCount;
        this.trumpetCount = trumpetCount;
        this.pianoCount = pianoCount;
    }

    public int getGuitarCount() {
        return guitarCount;
    }

    public void setGuitarCount(int guitarCount) {
        this.guitarCount = guitarCount;
    }

    public int getTrumpetCount() {
        return trumpetCount;
    }

    public void setTrumpetCount(int trumpetCount) {
        this.trumpetCount = trumpetCount;
    }

    public int getPianoCount() {
        return pianoCount;
    }

    public void setPianoCount(int pianoCount) {
        this.pianoCount = pianoCount;
    }
}
