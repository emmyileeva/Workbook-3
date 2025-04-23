package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {

    public static List<Employee> readEmployeesFromCSV(String fileName) {

        List<Employee> employees = new ArrayList<>();

        // Pseudocode for reading from CSV
        // 1. Open the file, try/catch necessary
        // 2. Read each line
        // 3. Split each line into fields
        // 4. Create an Employee object
        // 5. Add the Employee object to a list
        // 6. Close the file
        // 7. Return the list of employees

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            // Skip the first line (it contains column names like employeeId, name, hoursWorked, payRate)
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split("\\|");

            if (fields.length == 4) {
                int employeeId = Integer.parseInt(fields[0]);
                String name = fields[1];
                double hoursWorked = Double.parseDouble(fields[2]);
                double payRate = Double.parseDouble(fields[3]);

                // Create a new Employee object using the fields
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                // Add the employee to the list
                employees.add(employee);
                System.out.println("Employee added: " + employee.getName() + " with ID: " + employee.getEmployeeId());
                System.out.println();
            }}
            // Close the reader
            br.close();
        } catch (IOException e) {
            // Handle any exceptions that occur during file reading
            System.out.println("Error reading the file: ");
            e.printStackTrace();
        }
        return employees;
    }
}
