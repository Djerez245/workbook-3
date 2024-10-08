package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Stories {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("goldilocks.txt");
        Scanner scanner = new Scanner(fis);

        boolean storyTeller = false;
        while (storyTeller) {
            System.out.println("""
                    What story would you like to read?
                    1. Goldilocks
                    2. Hansel and Gretel
                    3. Mary had a little lamb
                    """);
            int userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput == 1) {
                try {
                    while (scanner.hasNextLine()) {
                        String input = scanner.nextLine();
                        System.out.println(input);
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
