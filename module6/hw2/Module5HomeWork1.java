package com.goit.gojavaonline.module6.hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ANTON on 30.05.2016.
 */
public class Module5HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfValuesOfArrayList;

        System.out.println("Please, enter number of values of your arrayList");

        try {
            numOfValuesOfArrayList = scanner.nextInt();
            if (numOfValuesOfArrayList <= 1) {
                System.out.println("Pls, use just 'integer > 1' Run the program once again");
                return;
            }
        } catch (InputMismatchException ex) {
            System.out.println("ERROR: You've entered wrong format of number. Pls, use just 'integer > 1'");
            return;
        }


        double[] arrayList = new double[numOfValuesOfArrayList];

        try {
            for (int i = 0; i < numOfValuesOfArrayList; i++) {
                System.out.println("Please, enter " + (i + 1) + " of " + numOfValuesOfArrayList + " value of your array");
                arrayList[i] = scanner.nextDouble();
            }

        } catch (InputMismatchException ex) {
            System.out.println("ERROR: You've entered wrong format of number. Pls, use just 'integer'");
            return;
        }

        boolean swapOccurred = true;

        while (swapOccurred) {
            swapOccurred = false;
            for (int i = 0; i < arrayList.length - 1; i++) {
                if (arrayList[i] > arrayList[i + 1]) {
                    double tempValue = arrayList[i];
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

        double minValueOfArray = arrayList[0];
        double maxValueOfArray = arrayList[arrayList.length - 1];

        System.out.println("Minimum of the array is " + minValueOfArray);
        System.out.println("Maximum of the array is " + maxValueOfArray);

    }
}

