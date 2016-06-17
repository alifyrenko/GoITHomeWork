package com.goit.gojavaonline.module5.hw1;

/**
 * Created by ANTON on 17.06.2016.
 */
public class MaxValueOfArray {
    public int getMaxValueOfArray(int [] array) {

        int maxValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                maxValue = array[0];
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
