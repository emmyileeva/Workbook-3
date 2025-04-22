package com.pluralsight;
import java.util.Scanner;
import java.util.Random;

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

                // Array to store 10 quotes
                String[] quotes = new String[10];

                // Adding quotes to the array
                quotes[0] = "The only limit to our realization of tomorrow is our doubts of today.";
                quotes[1] = "The future belongs to those who believe in the beauty of their dreams.";
                quotes[2] = "Success is not the key to happiness. Happiness is the key to success.";
                quotes[3] = "The best way to predict the future is to create it.";
                quotes[4] = "You miss 100% of the shots you don’t take.";
                quotes[5] = "The only way to do great work is to love what you do.";
                quotes[6] = "Life is 10% what happens to us and 90% how we react to it.";
                quotes[7] = "Your time is limited, so don’t waste it living someone else’s life.";
                quotes[8] = "The purpose of our lives is to be happy.";
                quotes[9] = "Get busy living or get busy dying.";

            boolean continueRunning = true;

            do {
                try {
                    System.out.print("Enter a number between 1 and 10 to get a quote (or 0 for a random quote): ");
                    int number = scanner.nextInt();

                    if (number == 0) {
                        // Display a random quote
                        int randomIndex = random.nextInt(10);
                        System.out.println("Random Quote: " + quotes[randomIndex]);
                    } else if (number < 1 || number > 10) {
                        System.out.println("Invalid input. Please enter a number between 1 and 10.");
                    } else {
                        // Display the quote user selected
                        System.out.println("Quote " + number + ": " + quotes[number - 1]);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine();
                }

                // Ask the user if they want to continue
                System.out.print("Do you want to see another quote? (yes/no): ");
                String response = scanner.next().trim().toLowerCase();
                if (!response.equals("yes")) {
                    continueRunning = false;
                }
            } while (continueRunning);

            scanner.close();
            System.out.println("Goodbye!");
        }
    }