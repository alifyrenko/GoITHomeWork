package com.goit.gojavaonline.module6.hw3;

/**
 * Created by ANTON on 01.06.2016.
 */
public class NegativeValueException extends Exception {
    private int countValue;

    public NegativeValueException(final int countValue) {
        this.countValue = countValue;
    }

    public int getCountValue() {
        return countValue;
    }
}
