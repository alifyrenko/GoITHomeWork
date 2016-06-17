package com.goit.gojavaonline.module5.hw2;

/**
 * Created by ANTON on 30.05.2016.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ANTON on 30.05.2016.
 */

public class GoJavaOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfValuesOfArrayList;

        System.out.println("Please, enter number of values of your arrayList");

        try {
            numOfValuesOfArrayList = scanner.nextInt();
            if (numOfValuesOfArrayList <=0) {
                System.out.println("Pls, use just 'integer > 0' Run the program once again");
                return;
            }
        } catch (InputMismatchException ex) {
            System.out.println("ERROR: You've entered wrong format of number. Pls, use just 'integer > 0'");
            return;
        }

        int[] arrayList = new int[numOfValuesOfArrayList];

        for (int i = 0; i < numOfValuesOfArrayList; i++) {
            System.out.println("Please, enter " + (i + 1) + " of " + numOfValuesOfArrayList + " value of your array");
            arrayList[i] = scanner.nextInt();
        }

        SortArray sortArray = new SortArray();

        sortArray.sort(arrayList);


        System.out.println("Below you can find your sorted array list:");
        for (int arrayListPrint : arrayList) {
            System.out.println(arrayListPrint);
        }

    }
}

