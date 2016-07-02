package com.goit.gojavaonline.module10.hw2;

import com.goit.gojavaonline.module9.hw1.CaesarCipherMethod;

import java.io.*;
import java.util.List;

/**
 * Created by ANTON on 16.06.2016.
 */
public class MessageCipher {

    public static void cipherMessageAndSaveInFile(List<String> listToCipher) throws IOException {

        List<String> listToSaveInFile = CaesarCipherMethod.cipher(listToCipher);

        try (FileOutputStream myFile = new FileOutputStream("cipheredFile.txt");
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(myFile, "UTF8"))) {
            writer.write(listToSaveInFile.toString());
        }
    }
}