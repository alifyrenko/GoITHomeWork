package com.goit.gojavaonline.module9.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANTON on 12.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("Audio File");
        stringList.add("Directory");
        stringList.add("File");
        stringList.add("Image File");
        stringList.add("Text File");


       List<String> encodeList =  CaesarCipher.cipher(stringList, "encode");
        encodeList
                .stream()
                .forEach(p -> System.out.println(p));

        System.out.println();

        List<String> decodes = CaesarCipher.cipher(encodeList, "decode");
        decodes
                .stream()
                .forEach(p -> System.out.println(p));
    }
}
