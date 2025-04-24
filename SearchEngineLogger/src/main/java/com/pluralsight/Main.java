package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Log application launch
        LoggerActions.logAction("launch", "");

        while (true) {
            // Prompt the user for a search term
            System.out.println("Enter a search term (X to exit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("X")) {
                // Log application exit
                LoggerActions.logAction("exit", "");
                System.out.println("Exiting application...");
                break;
            } else {
                // Log search action
                LoggerActions.logAction("search", input);
                System.out.println("Searching for: " + input);
            }
        }

        scanner.close();
    }
}