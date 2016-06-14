package com.goit.gojavaonline.module9.hw1;

/**
 * Created by ANTON on 14.06.2016.
 */
public class Cipher {

    public static final int AMOUNT_OF_VALUES_IN_ALPHABET = 26;
    public static final int SHIFT_NUMBER_FOR_CIPHER = 7;

    public static String makeArrayCipheredUnCiphered (char[] arrayToCipher, int cipher) {

        int indexOfValueInAlphabet;
        int indexOfCipherValue = 0;

        for (int counter = 0; counter < arrayToCipher.length; counter++) {

            if (arrayToCipher[counter] == ' ') {
                counter++;
            }

            indexOfValueInAlphabet = Alphabet.getNumOfValueInAlphabet(arrayToCipher[counter]);

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

            arrayToCipher[counter] = Alphabet.getLetterInAlphabetByIndex(indexOfCipherValue);
        }

        return new String(arrayToCipher);
    }
}
