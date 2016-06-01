package com.goit.gojavaonline.module5;

/**
 * Created by ANTON on 30.05.2016.
 */
public class NegativeAgeException extends Exception {
    private  int ageValue;

    public NegativeAgeException (final int ageValue) {
        this.ageValue = ageValue;
    }

    public int getAgeValue (){
        return ageValue;
    }
}
