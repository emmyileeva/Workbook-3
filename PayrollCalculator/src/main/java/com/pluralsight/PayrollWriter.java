package com.pluralsight;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PayrollWriter {

    public static void writePayrollToCSV(List<Employee> employees, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write the header
            writer.write("id|name|gross pay\n");
            // Write each employee's data
            for (Employee e : employees) {
                writer.write(e.getEmployeeId() + "|" + e.getName() + "|" + e.getGrossPay() + "\n");
            }
            System.out.println("Payroll written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void writePayrollToJSON(List<Employee> employees, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write the JSON array start
            writer.write("[\n");
            // Write each employee's data in JSON format
            for (int i = 0; i < employees.size(); i++) {
                Employee e = employees.get(i);
                writer.write("  { \"id\": " + e.getEmployeeId() + ", \"name\": \"" + e.getName() + "\", \"grossPay\": " + e.getGrossPay() + " }");
                if (i < employees.size() - 1) {
                    writer.write(",");
                }
                writer.write("\n");
            }
            writer.write("]\n");
            System.out.println("Payroll written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
