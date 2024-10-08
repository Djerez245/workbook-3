package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stories {
    public static void main(String[] args) throws FileNotFoundException {

        //      storyReader("goldilocks.txt");
        Scanner loop = new Scanner(System.in);

        boolean tellingStories = true;
        while (tellingStories) {

            System.out.println("""
                    \nHello what story would you like to read?\n
                    1. Goldilocks
                    2. Hansel and Gretel
                    3. Mary had a little lamb
                    4. Im all done time for bed
                    """);
            int user = loop.nextInt();

            if (user == 1)
                storyReader("goldilocks.txt");
            if (user == 2) {
                storyReader("hansel_and_gretel.txt");
            }
            if (user == 3) {
                storyReader("mary_had_a_little_lamb.txt");
            }
            if (user == 4) {
                tellingStories = false;
            }
        }

    }

    public static void storyReader(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(s);

        }
        scanner.close();

    }

}


