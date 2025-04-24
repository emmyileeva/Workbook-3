package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InventoryLoader {
    // Method to load inventory from a CSV file
    public static Map<String, Product> loadInventory(String fileName) {
        Map<String, Product> inventory = new HashMap<>();

        // Read the CSV file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                float price = Float.parseFloat(parts[2]);

                // Create a new Product object and add it to the inventory
                Product product = new Product(id, name, price);
                inventory.put(name.toLowerCase(), product);
            }
        } catch (IOException e) {
            System.err.println("Error reading inventory file: " + e.getMessage());
        }
        return inventory;
    }
}