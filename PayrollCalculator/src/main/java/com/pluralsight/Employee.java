package com.pluralsight;

public class Employee {

    // Private data members (attributes)
    private int employeeId;
    private String name;
    private double grossPay;

    // Parameterized constructor
    public Employee() {}

    // Constructor to initialize the Employee object with values
    public Employee(int employeeId, String name, double grossPay) {
        this.employeeId = employeeId;
        this.name = name;
        this.grossPay = grossPay;
    }

    // Getter and setter methods for each attribute
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }
}
