package com.goit.gojavaonline.offline5.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ANTON on 29.06.2016.
 */
public class FileCreation {

    public static void createListOfFilesByPath(String direction, String outputFile) throws IOException{

        String dateOfCreation;
        String fullPath;

        File path = new File(direction);
        String[] listOfFiles = path.list();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            writer.write((String.format("%-38s%-27s", "FileName", "FileDateCreation")));
            writer.newLine();
            writer.write("--------------------------------------------------------------------");
            writer.newLine();

            for (int i = 0; i < listOfFiles.length; i++) {
                fullPath = path + "\\" + listOfFiles[i];

                dateOfCreation = GetFileCreationDate.getCreationDate(fullPath);

                writer.write(String.format("%-38s%-27s", listOfFiles[i], dateOfCreation));
                writer.newLine();
            }
        }
    }
}
