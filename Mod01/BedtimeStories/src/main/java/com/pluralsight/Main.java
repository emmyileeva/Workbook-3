package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prompt the user for the name of the story/file to read
        System.out.println("Please enter the name of the story/file to read:");

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        // Create an instance of StoryReader
        StoryReader storyReader = new StoryReader();

        // Read and print the story
        try {
            storyReader.readStory(fileName);
        } catch (Exception e) {
            System.out.println("An error occurred while reading the story.");
            e.printStackTrace();
        }
    }
}
