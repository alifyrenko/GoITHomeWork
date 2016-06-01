package com.goit.gojavaonline.module5.hw1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ANTON on 30.05.2016.
 */

public class GoJavaOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minValue = 0;
        int maxValue = 0;

        System.out.println("Please, enter number of values of your arrayList");

        int numOfValuesOfArrayList = scanner.nextInt();
        int[] arrayList = new int[numOfValuesOfArrayList];

        for (int i = 0; i < numOfValuesOfArrayList; i++) {
            System.out.println("Please, enter " + (i + 1) + " of " + numOfValuesOfArrayList + " value of your array");
            arrayList[i] = scanner.nextInt();
        }

       /* for (int i = 0; i < arrayList.length; i++) {
            if (i == 0) {
                minValue = arrayList[0];
                maxValue = arrayList[0];
            }
            if (arrayList[i] < minValue) {
                minValue = arrayList[i];
            } else if (arrayList[i] > maxValue) {
                maxValue = arrayList[i];
            }
        }*/

        Arrays.sort(arrayList);
        minValue = arrayList[0];
        maxValue = arrayList[arrayList.length-1];

        System.out.println("Minimum of the array is " + minValue);
        System.out.println("Maximum of the array is " + maxValue);
    }
}