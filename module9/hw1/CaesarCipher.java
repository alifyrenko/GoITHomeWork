package com.goit.gojavaonline.module9.hw1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ANTON on 12.06.2016.
 */
public class CaesarCipher {

    public static List<String> cipher(List<String> list, String cipher) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, new String(list.get(i)).toLowerCase());
        }

        List<String> cipheredList = new ArrayList<>();

        int numOfValueInAlphabet;
        int numCipherValue = 0;
        final int SHIFT_NUMBER_FOR_CIPHER = 7;
        final int AMOUNT_OF_VALUES_IN_ALPHABET = 26;

        int n = 0;
        char[] alphabetArray = new char[AMOUNT_OF_VALUES_IN_ALPHABET];
        for (char i = 'a'; i <= 'z'; i++, n++) {
            alphabetArray[n] = i;
        }

        Map<Character, Integer> alphabetMap = new HashMap<>();
        n = 0;
        for (char i = 'a'; i <= 'z'; i++, n++) {
            alphabetMap.put(i, n);
        }

        for (int i = 0; i < list.size(); i++) {

            char[] arrayToCipher = list.get(i).toCharArray();

            for (int counter = 0; counter < arrayToCipher.length; counter++) {

                if (arrayToCipher[counter] == ' ') {
                    counter++;
                }

                numOfValueInAlphabet = alphabetMap.get(arrayToCipher[counter]);

                if (cipher == "decode") {
                    numCipherValue = numOfValueInAlphabet - SHIFT_NUMBER_FOR_CIPHER;
                    if (numCipherValue < 0) {
                        numCipherValue += AMOUNT_OF_VALUES_IN_ALPHABET;
                    }
                } else if (cipher == "encode") {
                    numCipherValue = (numOfValueInAlphabet + SHIFT_NUMBER_FOR_CIPHER) % AMOUNT_OF_VALUES_IN_ALPHABET;
                } else {
                    System.out.println("You should choose only 'encode' or 'decode'");
                    System.exit(0);
                }

                arrayToCipher[counter] = alphabetArray[numCipherValue];
            }
            cipheredList.add(new String(arrayToCipher));
        }
        return cipheredList;
    }
}
