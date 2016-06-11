package com.goit.gojavaonline.offline3;

import java.util.Scanner;

/**
 * Created by ANTON on 10.06.2016.
 */
public class GeometricCalculator {

    double side;
    double sideA;
    double sideB;
    double sideC;
    double radius;

    Scanner scanner = new Scanner(System.in);

    public void squareArea() {
        System.out.println("To find area of square enter it's side: ");
        side = scanner.nextDouble();
        if (side <= 0) {
            throw new ArithmeticException();
        }
        double result = side * side;
        System.out.println("Area of square = " + result);
        System.out.println();
    }

    public void rectangleArea() {
        System.out.println("To find area of rectangle enter it's two sides: ");
        sideA = scanner.nextDouble();
        sideB = scanner.nextDouble();
        if (sideA <= 0 || sideB <= 0) {
            throw new ArithmeticException();
        }

        double result = sideA * sideB;
        System.out.println("Area of rectangle = " + result);
        System.out.println();

    }

    public void cubeArea() {
        System.out.println("To find area of cube enter it's side: ");
        side = scanner.nextDouble();
        if (side <= 0) {
            throw new ArithmeticException();
        }

        double result = side * side * side;
        System.out.println("Area of cube = " + result);
        System.out.println();
    }

    public void paralelepipedArea() {
        System.out.println("To find area of paralelepiped enter it's 3 sides: ");
        sideA = scanner.nextDouble();
        sideB = scanner.nextDouble();
        sideC = scanner.nextDouble();
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new ArithmeticException();
        }

        double result = sideA * sideB * sideC;
        System.out.println("Area of paralelepiped = " + result);
        System.out.println();
    }

    public void circumference() {
        System.out.println("To find circumference enter it's radius: ");
        radius = scanner.nextDouble();
        if (radius <= 0) {
            throw new ArithmeticException();
        }

        double result = 2 * Math.PI * radius;
        System.out.println("Circumference = " + result);
        System.out.println();
    }

    public void circleArea() {
        System.out.println("To find area of circle enter it's radius: ");
        radius = scanner.nextDouble();
        if (radius <= 0) {
            throw new ArithmeticException();
        }

        double result = Math.PI * radius * radius;
        System.out.println("Area of circle = " + result);
        System.out.println();
    }

    public void sphereVolume() {
        System.out.println("To find area of sphere enter it's radius: ");
        radius = scanner.nextDouble();
        if (radius <= 0) {
            throw new ArithmeticException();
        }

        double result = 3 * (Math.PI * radius * radius * radius) / 4;
        System.out.println("Area of sphere = " + result);
        System.out.println();
    }
}
