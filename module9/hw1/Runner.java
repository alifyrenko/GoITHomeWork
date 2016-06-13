package com.goit.gojavaonline.module9.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ANTON on 12.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        int cipher;
        List<String> stringList = new ArrayList<>();

        stringList.add("Audio File");
        stringList.add("Directory");
        stringList.add("File");
        stringList.add("Image File");
        stringList.add("Text File");

        List<String> encodeList = CaesarCipher.cipher(stringList);

        System.out.println();

        CaesarCipher.cipher(encodeList);

    }
}
