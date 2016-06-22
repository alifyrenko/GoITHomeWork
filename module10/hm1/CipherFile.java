package com.goit.gojavaonline.module10.hm1;

import com.goit.gojavaonline.module9.hw1.Alphabet;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANTON on 15.06.2016.
 */
public class CipherFile {

    public static final int SHIFT_NUMBER_FOR_CIPHER = 7;

    public static void cipherFile(InputStream in, OutputStream out) throws IOException, NullPointerException {

        List<Character> specialSymbolsList = new ArrayList<>();

        int indexOfCipherValue;
        int indexOfValueInAlphabet = 0;

        int count;
        while ((count = in.read()) != -1) {

            try {
                indexOfValueInAlphabet = Alphabet.getIndexInAlphabetByLetter(((char) count));
                indexOfCipherValue = (indexOfValueInAlphabet + SHIFT_NUMBER_FOR_CIPHER) % Alphabet.AMOUNT_OF_VALUES_IN_ALPHABET;
                count = Alphabet.getLetterInAlphabetByIndex(indexOfCipherValue);
            } catch (NullPointerException ignore) {
                specialSymbolsList.add((char)count);
            }
            out.write(count);
        }
    }
}
