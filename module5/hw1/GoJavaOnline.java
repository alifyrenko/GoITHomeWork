package com.goit.gojavaonline.module5.hw1;

import java.util.Scanner;

/**
 * Created by ANTON on 30.05.2016.
 */

public class GoJavaOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter number of values of your arrayList");

        int numOfValuesOfArrayList = scanner.nextInt();
        int [] arrayList = new int[numOfValuesOfArrayList];

        for (int i = 0; i < numOfValuesOfArrayList; i++) {
            System.out.println("Please, enter " + (i + 1) + " of " + numOfValuesOfArrayList + " value of your array");
            arrayList[i] = scanner.nextInt();
        }

        boolean swapOccurred = true;

        while (swapOccurred) {
            swapOccurred = false;
            for (int i = 0; i < arrayList.length - 1; i++) {
                if (arrayList[i] > arrayList[i + 1]) {
                    int tempValue = arrayList[i];
                    arrayList[i] = arrayList[i + 1];
                    arrayList[i + 1] = tempValue;

                    swapOccurred = true;
                }
            }
        }

        System.out.println("Below you can find your sorted array list:");
        for (double arrayListPrint : arrayList) {
            System.out.println(arrayListPrint);
        }

        int minValueOfArray = arrayList[0];
        int maxValueOfArray = arrayList[arrayList.length - 1];

        System.out.println("Minimum of the array is " + minValueOfArray);
        System.out.println("Maximum of the array is " + maxValueOfArray);

    }
}
