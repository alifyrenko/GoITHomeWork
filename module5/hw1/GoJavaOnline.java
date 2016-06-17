package com.goit.gojavaonline.module5.hw1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ANTON on 30.05.2016.
 */

public class GoJavaOnline {
    public static void main(String[] args) {

        MaxValueOfArray maxValueOfArray = new MaxValueOfArray();
        MinValueOfArray minValueOfArray = new MinValueOfArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number of values of your arrayList");

        int numOfValuesOfArrayList = scanner.nextInt();
        int[] arrayList = new int[numOfValuesOfArrayList];

        for (int i = 0; i < numOfValuesOfArrayList; i++) {
            System.out.println("Please, enter " + (i + 1) + " of " + numOfValuesOfArrayList + " value of your array");
            arrayList[i] = scanner.nextInt();
        }


        int maxValue = maxValueOfArray.getMaxValueOfArray(arrayList);
        int minValue = minValueOfArray.getMinValueOfArray(arrayList);

        System.out.println("Minimum of the array is " + minValue);
        System.out.println("Maximum of the array is " + maxValue);
    }
}