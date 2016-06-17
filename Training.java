package com.goit.gojavaonline;

import com.goit.gojavaonline.module4.hw1.Circle;

/**
 * Created by ANTON on 17.06.2016.
 */
public class Training {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        double res = circle.calcArea();

        System.out.println(res);
    }
}
