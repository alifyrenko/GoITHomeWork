package com.goit.gojavaonline.offline5.task3;

import java.io.File;
import java.io.IOException;

/**
 * Created by ANTON on 30.06.2016.
 */
public class FileCreator {

    public static void mkFile(String dir, String fileName) throws IOException{
        File newFile = new File(dir + "\\" + fileName);

        if(newFile.createNewFile()){
            System.out.println("File '" + fileName + "' created successfully");
        } else {
            System.out.println("The file with name = '" + fileName + "' is already exist in this directory");
        }
    }
}
