package com.goit.gojavaonline.module4.hw1;

/**
 * Created by ANTON on 26.05.2016.
 */
public class Circle extends Figure {

   private int radius;

    public double calcArea(){
        return Math.PI* Math.pow(radius,2);

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
