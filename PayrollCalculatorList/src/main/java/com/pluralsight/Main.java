package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        //made a fileReader and a bufferedReader
        FileReader employeeReader = new FileReader("./src/main/resources/employees.csv");
        BufferedReader bufReader = new BufferedReader(employeeReader);
        String input;
//
        //Created ArrayList for the Employees and then split the array into parts
        ArrayList<Employee> employeesL = new ArrayList<>();

        while((input = bufReader.readLine()) != null ){
            String[] employeeParts = input.split("\\|"); // split the strings by the | in the string
            int employeeID = Integer.parseInt(employeeParts[0]); // parsed the integer from the first the part of the string
            String name = employeeParts[1]; // parsed the name from the array in the second part of the array
            double hoursWorked = Double.parseDouble(employeeParts[2]); // parsed the double for the third part of the string
            double payRate = Double.parseDouble(employeeParts[3]); // parsed the double in the fourth part of the string

            Employee e = new Employee(employeeID, name, hoursWorked, payRate); // put all the parts together to create an object for employees
            employeesL.add(e); // added the employees to the array

        }
        // added new employee to the ArrayList
        Employee e1 = new Employee(25, "Damian Jerez", 40, 20); //created a new employee
        employeesL.add(e1); // added new employee to class
        for (Employee t: employeesL){ //used enhanced for loop to print out the array
            System.out.println(t);
        }


    }
}

