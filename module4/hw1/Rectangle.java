package com.goit.gojavaonline.module4.hw1;

/**
 * Created by ANTON on 26.05.2016.
 */
public class Rectangle extends Figure{

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calcArea(){

        if(sideA <=0 || sideB <=0) {
            throw new ArithmeticException("Some of the sides < = 0!");
        }
        return sideA * sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
