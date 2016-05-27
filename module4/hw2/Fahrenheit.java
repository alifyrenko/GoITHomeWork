package com.goit.gojavaonline.module4.hw2;

/**
 * Created by ANTON on 26.05.2016.
 */

public class Fahrenheit {

    int celsiusTemp;

    Fahrenheit (int celsiusTemp){
        this.celsiusTemp = celsiusTemp;
    }

    public double convertCelsiusIntoFahrengeit () {
        return (celsiusTemp*1.8)+32;
    }

}
