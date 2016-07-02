package com.goit.gojavaonline.module10.hm1;

import java.io.*;

/**
 * Created by ANTON on 15.06.2016.
 */
public class Runner {

    public static void main(String[] args) throws IOException {

        String inputFilePath = "d:\\Education\\Java\\input.txt";
        String outputFilePath = "d:\\Education\\Java\\output.txt";

        try (InputStream reader = new FileInputStream(inputFilePath);
             OutputStream writer = new FileOutputStream(outputFilePath)) {
            CipherFile.cipherFile(reader, writer);
        }
    }
}
