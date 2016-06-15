package com.goit.gojavaonline.module10.training;

import com.goit.gojavaonline.module9.hw1.CaesarCipherMethod;
import com.goit.gojavaonline.module9.hw1.Cipher;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ANTON on 14.06.2016.
 */
public class Test {

    public static void main(String[] args)  throws IOException {

        FileInputStream in = new FileInputStream("D:\\Education\\Java\\HotKeys.xlsx");
        FileOutputStream out = new FileOutputStream("D:\\Education\\Java\\output.txt");

        int c;
        while ((c = in.read())!=-1){
            out.write(c);
        }
    }
}




