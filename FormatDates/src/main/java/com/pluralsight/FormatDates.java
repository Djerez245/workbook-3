package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {


    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime timeAndDate = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("E, MMM d, yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("E, MMM d, yyyy  HH:ss");

        String formattedDate1 = format1.format(date);
        String formattedDate2 = format2.format(date);
        String formattedDate3 = format3.format(date);
        String formattedDate4 = format4.format(timeAndDate);
        System.out.println(formattedDate1);
        System.out.println(formattedDate2);
        System.out.println(formattedDate3);
        System.out.println(formattedDate4);
    }
}
