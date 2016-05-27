package com.goit.gojavaonline.module4.hw3;

/**
 * Created by ANTON on 27.05.2016.
 */
public class DistanceBetweenPoints {

    double x1;
    double y1;
    double x2;
    double y2;

    DistanceBetweenPoints(double x1,double y1,double x2,double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double calcDistanceBetweenPoints () {
        return Math.sqrt ( Math.pow (x2-x1,2) + Math.pow (y2-y1,2) );
    }
}
