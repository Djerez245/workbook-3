package com.pluralsight;

public class Employee {
    int employeeID;
    String name;
    double hoursWorked;
    double payRate;



    @Override
    public String toString() {
        return String.format( "EmployeeID: %d" + " Name: %s" + " Hours Worked: %.2f" + " Pay-Rate: $%.2f per hour", employeeID, name, hoursWorked, payRate);

//        return "Employee{" +
//                "employeeID=" + employeeID +
//                ", name='" + name + '\'' +
//                ", hoursWorked=" + hoursWorked +
//                ", payRate=" + payRate +
//                '}';
    }

    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getPayRate() {
        return payRate;
    }

    public Employee(int employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}

