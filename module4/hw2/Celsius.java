package com.goit.gojavaonline.module4.hw2;

/**
 * Created by ANTON on 27.05.2016.
 */
public class Celsius {
    int fahrengeitTemp;

    Celsius (int fahrengeitTemp) {
        this.fahrengeitTemp = fahrengeitTemp;
    }

    public double convertFahrengeitIntoCelsius () {
        return (fahrengeitTemp - 32)/1.8;
    }
}
