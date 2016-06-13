package com.goit.gojavaonline.module9.hw1;

import java.util.*;

/**
 * Created by ANTON on 12.06.2016.
 */
public class CaesarCipher {

    public static List<String> cipher(List<String> list) {

        int cipher;

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to encode message - enter '1'");
        System.out.println("If you want to decode message - enter '2'");

        cipher = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            list.set(i, new String(list.get(i)).toLowerCase());
        }

        List<String> cipheredList = new ArrayList<>();

        int indexOfValueInAlphabet;
        int indexOfCipherValue = 0;
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

                indexOfValueInAlphabet = alphabetMap.get(arrayToCipher[counter]);

                if (cipher == 2) {
                    indexOfCipherValue = indexOfValueInAlphabet - SHIFT_NUMBER_FOR_CIPHER;
                    if (indexOfCipherValue < 0) {
                        indexOfCipherValue += AMOUNT_OF_VALUES_IN_ALPHABET;
                    }
                } else if (cipher == 1) {
                    indexOfCipherValue = (indexOfValueInAlphabet + SHIFT_NUMBER_FOR_CIPHER) % AMOUNT_OF_VALUES_IN_ALPHABET;
                } else {
                    System.out.println("You should choose only 1('encode') or 2('decode')");
                    System.exit(0);
                }

                arrayToCipher[counter] = alphabetArray[indexOfCipherValue];
            }
            cipheredList.add(new String(arrayToCipher));
        }


        if (cipher == 1) {
            System.out.println("Result of encoding you can find below:");
        } else {
            System.out.println("Result of decoding you can find below:");
        }

        System.out.println("-------------------------");
        cipheredList
                .stream()
                .forEach(p -> System.out.println(p));

        return cipheredList;
    }
}
