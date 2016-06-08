package com.goit.gojavaonline.offline2.task3;

/**
 * Created by ANTON on 08.06.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.calcAdd(5,10));
        System.out.println(calculator.calcMultiply(5,10));
        System.out.println(calculator.calcDivide(5,10));
    }
}
