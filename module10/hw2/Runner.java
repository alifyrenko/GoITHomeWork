package com.goit.gojavaonline.module10.hw2;

import com.goit.gojavaonline.module9.hw1.CaesarCipherMethod;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANTON on 16.06.2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {

       List<String> listToCipher = new ArrayList<>();

        listToCipher.add("Chicken macnaggets");
        listToCipher.add("Apple juice");
        listToCipher.add("CheeseBurger");
        listToCipher.add("Cola without ice");

        MessageCipher.cipherMessageAndSaveInFile(listToCipher);

    }
}
