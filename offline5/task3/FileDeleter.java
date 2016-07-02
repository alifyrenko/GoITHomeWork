package com.goit.gojavaonline.offline5.task3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by ANTON on 30.06.2016.
 */
public class FileDeleter {

    public static void rm (String dir, String fileName){
        File file = new File(dir + "//" + fileName);

        if(file.delete()){
            System.out.println("File " + fileName + " successfully deleted!");
        } else {
            System.out.println("File " + fileName + " do not exist");
        }
    }

}
