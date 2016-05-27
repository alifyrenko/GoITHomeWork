package com.goit.gojavaonline.module4.hw2;

/**
 * Created by ANTON on 27.05.2016.
 */
public class ClassRunProg {
    public static void main(String[] args) {

        Celsius celsius = new Celsius();
        int fahrTemp = 30;
        System.out.println(fahrTemp+" degrees Fahrengeit equals " + celsius.convertFahrengeitIntoCelsius(fahrTemp) + " degrees Celsius");

        Fahrenheit fahrenheit = new Fahrenheit();
        int celsiusTemp = 150;
        System.out.println(celsiusTemp+" degrees Celsius equals " + fahrenheit.convertCelsiusIntoFahrengeit(celsiusTemp) + " degrees Celsius");
    }
}
