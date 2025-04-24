package com.pluralsight;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime today = LocalDateTime.now();

        // Specify the date/time format to be used
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm z");
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");

        // Format the current date and time of each format
        String formattedDate1 = today.format(dtf1);
        String formattedDate2 = today.format(dtf2);
        String formattedDate3 = today.format(dtf3);

        //Convert to GMT time zone and format it
        ZonedDateTime gmtTime = today.atZone(ZoneId.of("GMT"));
        String formattedDate4 = gmtTime.format(dtf4);

        // Format in my local time zone
        String formattedDate5 = today.atZone(ZoneId.systemDefault()).format(dtf5);

        // Print the formatted date and time
        System.out.println("Formatted date 1: " + formattedDate1);
        System.out.println("Formatted date 2: " + formattedDate2);
        System.out.println("Formatted date 3: " + formattedDate3);
        System.out.println("Formatted date 4: " + formattedDate4);
        System.out.println("Formatted date 5: " + formattedDate5);
    }
}