package com.goit.gojavaonline.module9.hw1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ANTON on 14.06.2016.
 */
public class Alphabet {

    public static final int AMOUNT_OF_VALUES_IN_ALPHABET = 26;

    public static char getLetterInAlphabetByIndex(int index) {
        int indexOFArray = 0;
        char[] alphabetArray = new char[AMOUNT_OF_VALUES_IN_ALPHABET];
        for (char letterOfAlphabet = 'a'; letterOfAlphabet <= 'z'; letterOfAlphabet++, indexOFArray++) {
            alphabetArray[indexOFArray] = letterOfAlphabet;
        }
        return alphabetArray[index];
    }

    public static int getIndexInAlphabetByLetter(char letter) {
        Map<Character, Integer> alphabetMap = new HashMap<>();
        int valueOfMap = 0;
        for (char letterOfAlphabet = 'a'; letterOfAlphabet <= 'z'; letterOfAlphabet++, valueOfMap++) {
            alphabetMap.put(letterOfAlphabet, valueOfMap);
        }
        return alphabetMap.get(letter);
    }
}
