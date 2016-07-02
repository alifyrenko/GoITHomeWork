package com.goit.gojavaonline.offline5.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 * Created by ANTON on 29.06.2016.
 */
public class GetFileCreationDate {

    public static String getCreationDate(String path) throws IOException{

        Path pathOfFiles = Paths.get(path);

        BasicFileAttributes attributes = Files.readAttributes(pathOfFiles, BasicFileAttributes.class);
        FileTime creationTime = attributes.creationTime();

        return creationTime.toString();
    }
}
