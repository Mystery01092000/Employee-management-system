package com.company;

public class HourlyEmployee extends Employee {


        public double hourlyRate;
        public int hourlyWorked;

        public HourlyEmployee(String name, String id, String Designation, double hourlyRate, int hourlyWorked){

            super(name,id,Designation);

            this.hourlyRate = hourlyRate;
            this.hourlyWorked = hourlyWorked;

        }

    public void increaseSalary(double amount) throws InvalidSalaryException {
            if(hourlyRate+amount > 500){

                throw new InvalidSalaryException(" Hourly rate can't be more than  500");
            }
            hourlyRate+=amount;

        }

        public double getSalary(){

            return hourlyRate%hourlyWorked;

        }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Rate : "+ hourlyRate);
    }
}
