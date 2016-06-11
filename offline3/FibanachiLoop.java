package com.goit.gojavaonline.offline3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ANTON on 10.06.2016.
 */
public class FibanachiLoop {

    public static double fibanachiCalc(int n) {

        List<Double> fibanNumbersList = new ArrayList<>();
        Double result = 0.0;

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibanNumbersList.add(i, 1.0);
            } else {
                result = fibanNumbersList.get(i-1) + fibanNumbersList.get(i-2);
                fibanNumbersList.add(i, result);
            }
        }
        return result;
    }
}
