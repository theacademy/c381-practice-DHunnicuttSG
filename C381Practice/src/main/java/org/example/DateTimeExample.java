package org.example;

import java.time.*;


public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);

        // ISO format standard is YYYY-MM-DDThh:mm:ss

        LocalDateTime past = ld.minusDays(5);
        System.out.println(past);

        Month month = ld.getMonth();
        int intMonth = ld.getMonthValue();
        System.out.println("Month: " + month + " " + intMonth);

        int year = ld.getYear();
        System.out.println("Year: " + year);

        int day = ld.getDayOfMonth();
        System.out.println("Day: " + day);
    }


}
