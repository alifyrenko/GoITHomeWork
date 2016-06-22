package com.goit.gojavaonline.stream;


import java.io.File;

/**
 * Created by ANTON on 20.06.2016.
 */
public class DirList {

    public static void main(String[] args) {
        File path = new File("D:\\Education\\Java");
        String [] list;

        for (String s : list = path.list()) {
            System.out.println(s);
        }
        ;


    }
}
