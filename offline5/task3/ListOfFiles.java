package com.goit.gojavaonline.offline5.task3;


import java.io.File;

/**
 * Created by ANTON on 30.06.2016.
 */
public class ListOfFiles {

    public static void list(String dir) {
        File file = new File(dir);
        String[] fileList = file.list();

        for (String s : fileList) {
            System.out.println(s);
        }

    }
}
