package com.goit.gojavaonline.module5.hw2;

/**
 * Created by ANTON on 17.06.2016.
 */
public class SortArray {

    public int[] sort(int[] array) {

        boolean swapOccurred = true;

        while (swapOccurred) {
            swapOccurred = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;

                    swapOccurred = true;
                }
            }
        }

        return array;
    }
}
