package com.goit.gojavaonline.module4.hw1;

/**
 * Created by ANTON on 26.05.2016.
 */
public class Triangle extends Figure {

    private int sideA;
    private int sideB;
    private int sideC;

    public double calcArea () {

        int p = (sideA + sideB + sideC)/2;
        return Math.sqrt(p*((p-sideA)*(p-sideB)*(p-sideC)));


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
