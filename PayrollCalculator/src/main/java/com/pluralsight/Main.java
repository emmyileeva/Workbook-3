package com.pluralsight;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Read the employees from the CSV file and store them in a list
        List<Employee> employees = EmployeeReader.readEmployeesFromCSV("employeeData.csv");

        // Print the employees to the console
        for (Employee e : employees) {
            System.out.println("Employee ID: " + e.getEmployeeId());
            System.out.println("Employee Name: " + e.getName());
            System.out.println("Hours Worked: " + e.getHoursWorked());
            System.out.println("Pay Rate: " + e.getPayRate());
            System.out.println("Gross Pay: " + e.getGrossPay());
            System.out.println("-----------------------------");
        }
    }
}