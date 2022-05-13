package com.techelevator;

public class Employee {
private int employeeId = 0;
private String lastName = null;
private String firstName = null;
private String department = null;
private double annualSalary = 0;

public Employee(int employeeId, String firstName, String lastName, double annualSalary){
    this.employeeId = employeeId;
    this.firstName= firstName;
    this.lastName = lastName;
    this.annualSalary = annualSalary;
}
public void raiseSalary(double percent){
    double percentGain = (percent/100)+1;
    if(percent>0){
        annualSalary =annualSalary*percentGain;
    }
}

    public int getEmployeeId() {
        return employeeId;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
