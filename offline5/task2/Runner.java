package com.goit.gojavaonline.offline5.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by ANTON on 29.06.2016.
 */
public class Runner {
    public static void main(String[] args) throws Exception {

        String direction = "D:\\Education\\Java\\JavaRushHomeWork";
        String outputFile = "D:\\Education\\Java\\finalListOfFiles.txt";

        FileCreation.createListOfFilesByPath(direction, outputFile);

        }
    }
