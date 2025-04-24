package com.pluralsight;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerActions {

private static String logFile = "logs.txt";
private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Method to log the actions of the user
    public static void logAction(String action, String searchTerm) {

        String timestamp = LocalDateTime.now().format(formatter); // Get and format the timestamp
        String logEntry = timestamp + " " + action; // Start building the log entry
        if (action.equals("search")) {
            logEntry += ": " + searchTerm; // Append the search term if the action is a search
        } else if (action.equals("exit")) {
            logEntry += ": Exiting application"; // Append exit message
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(logEntry);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
