package com.goit.gojavaonline.module10.hm1;

import com.goit.gojavaonline.module9.hw1.Alphabet;
import java.io.*;

/**
 * Created by ANTON on 15.06.2016.
 */
public class CipherFile {

    public static final int SHIFT_NUMBER_FOR_CIPHER = 7;

    public static void cipherFile(InputStream in, OutputStream out) throws IOException {

        int indexOfCipherValue;
        int indexOfValueInAlphabet = 0;

        int count;
        while ((count = in.read()) != -1) {

            try {
                indexOfValueInAlphabet = Alphabet.getIndexInAlphabetByLetter(((char) count));
                indexOfCipherValue = (indexOfValueInAlphabet + SHIFT_NUMBER_FOR_CIPHER) % Alphabet.AMOUNT_OF_VALUES_IN_ALPHABET;
                count = Alphabet.getLetterInAlphabetByIndex(indexOfCipherValue);
            } catch (NullPointerException ignore) {/*ignore special symbols like*/}
            out.write(count);
        }
    }

    public static void closeAndFlushQuietly(OutputStream out) {

        if (out != null) {
            try {
                out.flush();
            } catch (IOException ignore) {/*ignore*/}
            try {
                out.close();
            } catch (IOException ignore) {/*ignore*/}
        }
    }

    public static void closeQuietly(InputStream in) {
        if (in != null) {

            try {
                in.close();
            } catch (IOException ignore) {/*ignore*/}
        }
    }
}
