package com.learn.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class DateTime{
    
    public static void main(String[] args) {

        // ------------------------------
        // 1️⃣ LocalDate – Date only
        // ------------------------------
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(2000, 1, 24);

        System.out.println("Today: " + today);
        System.out.println("Date of Birth: " + dob);

        // Add / Subtract
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastYear = today.minusYears(1);

        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Year: " + lastYear);

        // ------------------------------
        //  LocalTime – Time only
        // ------------------------------
        LocalTime now = LocalTime.now();
        LocalTime meeting = LocalTime.of(14, 30); // 2:30 PM

        System.out.println("Current Time: " + now);
        System.out.println("Meeting Time: " + meeting);

        // ------------------------------
        //  LocalDateTime – Date + Time
        // ------------------------------
        LocalDateTime dt = LocalDateTime.now();
        LocalDateTime future = dt.plusDays(5).plusHours(3);

        System.out.println("Current DateTime: " + dt);
        System.out.println("Future DateTime: " + future);

        // ------------------------------
        //  Formatting & Parsing
        // ------------------------------
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatted = dt.format(formatter);
        System.out.println("Formatted DateTime: " + formatted);

        String dateStr = "24-01-2000 10:15";
        LocalDateTime parsedDate = LocalDateTime.parse(dateStr, formatter);
        System.out.println("Parsed DateTime: " + parsedDate);

       

        // ------------------------------
        // 6️ Calculate Age
        // ------------------------------
        int age = Period.between(dob, today).getYears();
        System.out.println("Age: " + age);

       
    }
}