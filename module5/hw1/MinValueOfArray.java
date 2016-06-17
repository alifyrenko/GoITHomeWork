package com.goit.gojavaonline.module5.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANTON on 17.06.2016.
 */
public class MinValueOfArray {

    public int getMinValueOfArray(int [] array) {

        int minValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                minValue = array[0];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
