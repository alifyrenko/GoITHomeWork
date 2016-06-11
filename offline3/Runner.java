package com.goit.gojavaonline.offline3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ANTON on 10.06.2016.
 */
public class Runner {

    public static void main(String[] args) {

        final int EXTREME_NUMBER = 50;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to get Fibanachi Number: ");
        int requiredNumber = scanner.nextInt();

        long start = System.nanoTime();

        if (requiredNumber < EXTREME_NUMBER) {

            result = FibanachiRecursion.fibanachiCalc(requiredNumber);
            System.out.println("Operation was implemented by Recursion");
        } else {
            FibanachiLoop fibanachiLoop = new FibanachiLoop();
            result = FibanachiLoop.fibanachiCalc(requiredNumber);
            System.out.println("Operation was implemented by Loop");
        }

        long finish = System.nanoTime();
        long duration = finish - start;

        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Fibanachi number of " + requiredNumber + " = " + df.format(result));
        System.out.println("It took " + df.format ((double) duration / 1000000000) + " seconds to calculate");
    }
}
