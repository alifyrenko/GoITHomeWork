package com.goit.gojavaonline.module3_new.example4;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ANTON on 23.06.2016.
 */
public class Runner {

    public static void main(String[] args) {

        boolean isDigit = false;
        while (!isDigit){

            try {
                int a = new Scanner(System.in).nextInt();
                System.out.println("Your digit is = " + a);
                break;
            } catch (InputMismatchException e){
                System.out.println("is not a digit!");
            }
        }

    }
}
