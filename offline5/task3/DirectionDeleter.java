package com.goit.gojavaonline.offline5.task3;

import java.io.File;

/**
 * Created by ANTON on 30.06.2016.
 */
public class DirectionDeleter {

    public static void rmdir(String path, String dirName) {
        File dir = new File(path + "//" + dirName + "//");
        if (dir.delete()) {
            System.out.println("Directory " + dirName + " successfully deleted!");
        } else {
            System.out.println("Directory " + dirName + " do not exist");
        }
    }
}
