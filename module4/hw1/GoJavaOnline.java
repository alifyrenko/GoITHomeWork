package com.goit.gojavaonline.module4.hw1;

/**
 * Created by ANTON on 26.05.2016.
 */
public class GoJavaOnline {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.setSideA(5);
        triangle.setSideB(6);
        triangle.setSideC(7);

        System.out.println("Triangle area = " + triangle.calcArea());

        Rectangle rectangle = new Rectangle();

        rectangle.setSideA(10);
        rectangle.setSideB(15);

        System.out.println("Rectangle area = " + rectangle.calcArea());

        Circle circle = new Circle();

        circle.setRadius(10);

        System.out.println("Circle area is = " + circle.calcArea());


    }
}
