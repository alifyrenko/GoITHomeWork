package com.goit.gojavaonline.module4.hw1;

/**
 * Created by ANTON on 26.05.2016.
 */
public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calcArea(){

        if (radius <= 0){
            throw new ArithmeticException("Radius should be >=0!");
        }
        return Math.PI * Math.pow(this.radius,2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
