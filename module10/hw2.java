package com.goit.gojavaonline.module10;

import java.io.*;

/**
 * Created by ANTON on 15.06.2016.
 */
public class hw2 {

    public static void main(String[] args) throws IOException {


        String textToCipher = "I Love Java!";


            FileOutputStream myFile = new FileOutputStream("cipheredFile.txt");

        Writer out = new BufferedWriter(new OutputStreamWriter(myFile, "UTF8"));
        out.write(textToCipher);

    }
}
