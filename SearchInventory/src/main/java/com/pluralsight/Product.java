package com.pluralsight;

public class Product {

    //Product attributes
    private int id;
    private String name;
    private float price;

    // Constructor
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }
}
