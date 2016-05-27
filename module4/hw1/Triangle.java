package com.goit.gojavaonline.module4.hw1;

/**
 * Created by ANTON on 26.05.2016.
 */
public class Triangle extends Figure {

    private int sideA;
    private int sideB;
    private int sideC;

    Triangle (int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calcArea () {
        int halfPerimeter = (sideA + sideB + sideC)/2;
        return Math.sqrt( halfPerimeter * ( (halfPerimeter-sideA) * (halfPerimeter-sideB) * (halfPerimeter-sideC) ) );
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

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}
