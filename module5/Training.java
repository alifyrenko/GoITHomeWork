package com.goit.gojavaonline.module5;

import java.util.Scanner;

/**
 * Created by ANTON on 30.05.2016.
 */
public class Training {
    public static void main(String[] args) {
        System.out.println("Hello, pls, enter your age'");

        final Scanner scanner = new Scanner(System.in);

        final String userInput = scanner.next();

        try {
            final int age = Integer.parseInt(userInput);
            if (age < 0) {
                throw new NegativeAgeException(age);
            }

            System.out.println("Your age is " + age);
        } catch (NumberFormatException ex) {
            System.out.println("Error: Age should be an integer!");
        } catch (NegativeAgeException e) {
            System.out.println("Error: Entered age is " + e.getAgeValue() + " Age should be above 0");
        }


    }

}
