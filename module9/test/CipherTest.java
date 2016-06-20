package com.goit.gojavaonline.module9.test;

import com.goit.gojavaonline.module9.hw1.Alphabet;
import com.goit.gojavaonline.module9.hw1.Cipher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {

    @Test
    public void testCipher() {


        String stringToCipher = "Antonio Banderas";
        stringToCipher = stringToCipher.toLowerCase();

        char[] arrayToCipher = stringToCipher.toCharArray();

        for (int i = 0; i < arrayToCipher.length; i++) {
            if (arrayToCipher[i] == ' ') {
                i++;
            }
            int indexOfCipheredLetter = Alphabet.getIndexInAlphabetByLetter(arrayToCipher[i]) + Cipher.SHIFT_NUMBER_FOR_CIPHER;
            if (indexOfCipheredLetter >= Cipher.AMOUNT_OF_VALUES_IN_ALPHABET) {
                indexOfCipheredLetter = (Alphabet.getIndexInAlphabetByLetter(arrayToCipher[i]) + Cipher.SHIFT_NUMBER_FOR_CIPHER) - Cipher.AMOUNT_OF_VALUES_IN_ALPHABET;
            }
            char cipheredLetter = Alphabet.getLetterInAlphabetByIndex(indexOfCipheredLetter);

            arrayToCipher[i] = cipheredLetter;
        }

        String expected = new String(arrayToCipher);
        String actual = Cipher.makeArrayCipheredUnCiphered(stringToCipher.toCharArray(), Cipher.ENCODE);

        Assert.assertEquals(expected, actual);
    }
}