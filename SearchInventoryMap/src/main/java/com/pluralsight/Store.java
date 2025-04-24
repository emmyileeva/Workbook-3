package com.pluralsight;

import java.util.Map;
import java.util.Scanner;

public class Store {

    private static Map<String, Product> inventory;

    public static void main(String[] args) {
        // Load inventory from CSV file
        inventory = InventoryLoader.loadInventory("inventory.csv");
        Scanner scanner = new Scanner(System.in);

        // Display available products
        while (true) {
            System.out.println("Available products:");
            for (String productName : inventory.keySet()) {
                System.out.println("- " + productName);
            }
            // Prompt user for product name
            System.out.print("What product are you interested in? ");
            String name = scanner.nextLine().toLowerCase();
            Product matchedProduct = inventory.get(name);

            // Check if the product exists
            if (matchedProduct == null) {
                System.out.println("We don't carry that product.");
            } else {
                System.out.printf("We carry %s and the price is $%.2f%n",
                        matchedProduct.getName(), matchedProduct.getPrice());
            }

            // Ask if the user wants to search again
            System.out.print("Do you want to search again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            // Exit if the user does not want to search again
            if (!response.equals("yes")) {
                break;
            }
        }
        scanner.close();
    }
}