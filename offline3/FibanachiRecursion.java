package com.goit.gojavaonline.offline3;

/**
 * Created by ANTON on 11.06.2016.
 */
public class FibanachiRecursion {

    public static double fibanachiCalc(int n) {

        double result;

        if (n == 1 || n == 2) return 1;
        result = fibanachiCalc(n-1) + fibanachiCalc(n-2);
        return result;
    }
}
