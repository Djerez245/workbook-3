package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //to get user inputs for buffered reader and writer
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the employees file: ");
        String employeesFile = scanner.nextLine();

        System.out.println("Enter the name of the payroll file that you would like to create: ");
        String payrollFile = scanner.nextLine();

        //made a fileReader and a bufferedReader
        FileReader employeeReader = new FileReader(employeesFile);
        BufferedReader bufReader = new BufferedReader(employeeReader);
        String input;

        FileWriter employeeWriter = new FileWriter(payrollFile);
        BufferedWriter buffWriter = new BufferedWriter(employeeWriter);

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
        Employee e2 = new Employee(26, "Jontez Snider", 60, 25);
        employeesL.add(e2);

        for (Employee t: employeesL){ //used enhanced for loop to print out the array
            System.out.println(t);
            buffWriter.write( String.format("ID: %-10d" + "|" + "Name: %-20s" + "|" + "Pay: $%-20.2f\n", t.getEmployeeID(), t.getName(), t.getGrossPay()));
        }
        buffWriter.close();
    }
}

