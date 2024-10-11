package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {




    public static void main(String[] args) throws IOException {

        FileWriter logs = new FileWriter("logs.txt");
        BufferedWriter bufWriter = new BufferedWriter(logs);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatedDateAndTime = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter search term or enter X to exit: ");
        String searchTerm = scanner.nextLine();
        bufWriter.write(searchTerm + LocalDateTime.now());
        bufWriter.close();
        System.out.println("We could not find any result for: %5s" + searchTerm);

            }

        }












