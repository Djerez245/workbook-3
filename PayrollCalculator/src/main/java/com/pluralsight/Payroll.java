package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Payroll {
    public static void main(String[] args) throws IOException {

        Employee e;

        //made a fileReader and a bufferedReader
        FileReader employeeReader = new FileReader("./src/main/resources/employees.csv");
        BufferedReader bufReader = new BufferedReader(employeeReader);
        String input;

        //split the array into parts
        Employee[] employees = new Employee[4];

        while((input = bufReader.readLine()) != null ){
            String[] employeeParts = input.split("\\|");
            int employeeID = Integer.parseInt(employeeParts[0]);
            String name = employeeParts[1];
            double hoursWorked = Double.parseDouble(employeeParts[2]);
            double payRate = Double.parseDouble(employeeParts[3]);

            e = new Employee(employeeID, name, hoursWorked, payRate);

            //formatted the results
            System.out.printf( "%s\s$%.2f\n", e.getName(), e.getHoursWorked() * e.getPayRate());



        }


    }
}
