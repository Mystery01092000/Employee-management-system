package com.company;

public class SalariedEmployee extends Employee {

    public double monthlySalary;

    public SalariedEmployee(String name, String id, String Designation, Double monthlySalary){

        super(name,id,Designation);
        this.monthlySalary = monthlySalary;

    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Salary : "+ monthlySalary);
    }
}
