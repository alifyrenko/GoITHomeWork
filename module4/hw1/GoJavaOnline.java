package com.goit.gojavaonline.module4.hw1;

import java.util.IllegalFormatException;

/**
 * Created by ANTON on 26.05.2016.
 */

public class GoJavaOnline {
    public static void main(String[] args) {

        try {
            Triangle triangle = new Triangle(-5, 6, 7);
            System.out.println("Triangle area = " + triangle.calcArea());

            Rectangle rectangle = new Rectangle(10, 10);
            System.out.println("Rectangle area = " + rectangle.calcArea());

            Circle circle = new Circle(10);
            System.out.println("Circle area is = " + circle.calcArea());

        } catch (IllegalFormatException ex) {
            System.out.println("Error: wrong format, pls use only integer");
        }
    }
}
