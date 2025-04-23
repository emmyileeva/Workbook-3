package com.pluralsight;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StoryReader {

    public List<String> readStory(String fileName) {
        List<String> storyLines = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(fileName);

            Scanner scanner = new Scanner(fis);

            int lineNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(lineNumber + ": " + line);
                storyLines.add(line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + fileName);
            e.printStackTrace();
        }

        return storyLines;
    }
}
