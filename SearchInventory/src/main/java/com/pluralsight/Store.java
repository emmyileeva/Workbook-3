package com.pluralsight;

import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            displayMenu();
            int command = scanner.nextInt();
            scanner.nextLine();

            if (!handleCommand(command, inventoryManager, scanner)) {
                break;
            }
        }
    }

    // Display the menu options and handle user input until the user chooses to quit
    private static void displayMenu() {
        System.out.println("\nWhat do you want to do?\n");
        System.out.println("1. List all products");
        System.out.println("2. Look up a product by its ID");
        System.out.println("3. Find all products within a price range");
        System.out.println("4. Add a new product");
        System.out.println("5. Quit the application");
        System.out.print("\nEnter command:\n ");
    }

    // Handle the command entered by the user
    private static boolean handleCommand(int command, InventoryManager inventoryManager, Scanner scanner) {
        switch (command) {
            case 1:
                inventoryManager.listAllProducts();
                break;
            case 2:
                inventoryManager.lookUpProductById(scanner);
                break;
            case 3:
                inventoryManager.findProductsInRange(scanner);
                break;
            case 4:
                inventoryManager.addProduct(scanner);
                break;
            case 5:
                System.out.println("Exiting the application. Goodbye!");
                return false; // Exit the application
        }
        return true; // Continue the application
    }
}