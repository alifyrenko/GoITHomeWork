package com.goit.gojavaonline.module4.hw2;

/**
 * Created by ANTON on 27.05.2016.
 */
public class ClassRunProg {
    public static void main(String[] args) {

        int fahrTemp = 30;
        Celsius celsius = new Celsius(fahrTemp);
        System.out.println(fahrTemp+" degrees Fahrengeit equals " + celsius.convertFahrengeitIntoCelsius() + " degrees Celsius");

        int celsiusTemp = 150;
        Fahrenheit fahrenheit = new Fahrenheit(celsiusTemp);
        System.out.println(celsiusTemp+" degrees Celsius equals " + fahrenheit.convertCelsiusIntoFahrengeit() + " degrees Celsius");
    }
}
