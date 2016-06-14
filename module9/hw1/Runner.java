package com.goit.gojavaonline.module9.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANTON on 12.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        List<String> listToCipher = new ArrayList<>();

        listToCipher.add("Audio File");
        listToCipher.add("Directory");
        listToCipher.add("File");
        listToCipher.add("Image File");
        listToCipher.add("Text File");

        List<String> encodedList = CaesarCipherMethod.cipher(listToCipher);

        System.out.println();

        CaesarCipherMethod.cipher(encodedList);
    }
}
