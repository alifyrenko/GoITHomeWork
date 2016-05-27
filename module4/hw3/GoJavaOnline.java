package com.goit.gojavaonline.module4.hw3;

/**
 * Created by ANTON on 27.05.2016.
 */
public class GoJavaOnline {
    public static void main(String[] args) {

        int x1 = 5;
        int x2 = 10;
        int y1 = 5;
        int y2 = 10;

        DistanceBetweenPoints distanceBetweenPoints = new DistanceBetweenPoints(x1,y1,x2,y2);

        System.out.println("Distance between two points with coordinates (x1=" + x1 + ", y1=" + y1 + "; x2=" + x2 + ", y2=" + y2 + ") " +
            "equals " + distanceBetweenPoints.calcDistanceBetweenPoints());
    }
}
