package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoryApp {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis = new FileInputStream("./src/main/resources/goldilocks.txt");
        Scanner filescanner = new Scanner(fis);

        while ( filescanner.hasNextLine()){
            String input = filescanner.nextLine();
            System.out.println(input);
        }
    }
}
