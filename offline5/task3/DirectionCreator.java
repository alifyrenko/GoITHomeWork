package com.goit.gojavaonline.offline5.task3;

import java.io.File;

/**
 * Created by ANTON on 30.06.2016.
 */
public class DirectionCreator {

    public static void mkdir(String path, String dirName) {
        File dir = new File(path + "//" + dirName + "//");
        if (dir.mkdir()) {
            System.out.println("Directory '" + dirName + "' created successfully");
        } else {
            System.out.println("Directory with name = '" + dirName + "' is already exist!");
        }
    }
}

