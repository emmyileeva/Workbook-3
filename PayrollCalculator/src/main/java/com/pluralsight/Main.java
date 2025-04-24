package com.pluralsight;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for input file name
        System.out.println("Enter the name of the employee file to process: ");
        String fileName = scanner.nextLine();

        // Read employees from the input file
        List<Employee> employees = EmployeeReader.readEmployeesFromCSV(fileName);

        // Prompt for output file name
        System.out.println("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        // Check the output file extension
        if (outputFileName.endsWith(".csv")) {
            PayrollWriter.writePayrollToCSV(employees, outputFileName);
        } else if (outputFileName.endsWith(".json")) {
            PayrollWriter.writePayrollToJSON(employees, outputFileName);
        } else {
            System.out.println("Unsupported file format. Please use .csv or .json.");
        }
    }
}