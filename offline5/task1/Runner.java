package com.goit.gojavaonline.offline5.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANTON on 29.06.2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();

        String inputPath = "d:\\Education\\Java\\input.txt";
        String outputPath = "d:\\Education\\Java\\result.txt";

        File file = new File(inputPath);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if(!line.isEmpty()){
                    list.add(line);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                List<String> listOutput = new ArrayList<>();
                String[] arrayOutput = list.get(i).split(" ");

                for (int j = 0; j < arrayOutput.length; j++) {

                    if (arrayOutput[j].length() < 3 || arrayOutput[j].length() > 5)
                        if (!arrayOutput[j].equals("")) {
                            listOutput.add(arrayOutput[j]);
                        }
                }

                writer.write(listOutput.toString());
                writer.newLine();
            }
        }
    }
}