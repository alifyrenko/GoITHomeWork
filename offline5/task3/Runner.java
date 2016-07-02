package com.goit.gojavaonline.offline5.task3;

import java.io.IOException;

/**
 * Created by ANTON on 30.06.2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException{

        String dir = "D:\\Education\\Java";
        String fileName = "testFolder";

        ListOfFiles.list(dir);
        //DirectionCreator.mkdir(dir,fileName);
        //DirectionDeleter.rmdir(dir,fileName);
        //FileCreator.mkFile(dir,fileName);
        //FileDeleter.rm(dir,fileName);
    }
}
