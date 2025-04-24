package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class InventoryManager {
    private ArrayList<Product> inventory;

    public InventoryManager() {
        this.inventory = loadInventory();
    }

    // Load inventory from a CSV file
    private ArrayList<Product> loadInventory() {

        ArrayList<Product> inventory = new ArrayList<>();
        String fileName = "inventory.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    float price = Float.parseFloat(parts[2]);
                    inventory.add(new Product(id, name, price));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return inventory;
    }

    // List all products in the inventory
    public void listAllProducts() {
        Collections.sort(inventory, Comparator.comparing(Product::getName));
        System.out.println("\nOur store carries the following inventory: \n");
        for (Product p : inventory) {
            System.out.printf("ID: %d Name: %s Price: $%.2f\n", p.getId(), p.getName(), p.getPrice());
        }
    }

    // Look up a product by its ID
    public void lookUpProductById(Scanner scanner) {
        System.out.print("Enter the product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Product p : inventory) {
            if (p.getId() == id) {
                System.out.printf("ID: %d Name: %s Price: $%.2f\n", p.getId(), p.getName(), p.getPrice());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Find all products within a price range
    public void findProductsInRange(Scanner scanner) {
        System.out.print("Enter the minimum price: ");
        float minPrice = scanner.nextFloat();
        System.out.print("Enter the maximum price: ");
        float maxPrice = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Products in the price range:");
        for (Product p : inventory) {
            if (p.getPrice() >= minPrice && p.getPrice() <= maxPrice) {
                System.out.printf("ID: %d Name: %s Price: $%.2f\n", p.getId(), p.getName(), p.getPrice());
            }
        }
    }

    // Add a new product to the inventory
    public void addProduct(Scanner scanner) {
        System.out.print("Enter the product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the product price: ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        Product newProduct = new Product(id, name, price);
        inventory.add(newProduct);
        System.out.println("Product added successfully.");
    }
}