package com.goit.gojavaonline.module4.hw3;

/**
 * Created by ANTON on 27.05.2016.
 */
public class DistanceBetweenPoints {

    public double distanceBetweenPoints (double x1,double y1,double x2,double y2) {

        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
