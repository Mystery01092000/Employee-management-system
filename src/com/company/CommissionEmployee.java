package com.company;

public class CommissionEmployee extends Employee{

    public double commission;
    public double sale;

    public CommissionEmployee(String name,String id,String designation,double commission,double sale){
        super(name,id,designation);
        this.commission = commission;
        this.sale = sale;
    }

    public double getSalary(double _sale){
        return commission*_sale;
    }


    public void increaseSalary(double amount) throws InvalidSalaryException{

        if(commission+amount>.30)
            throw new InvalidSalaryException("Commission cannot be more than 30%");
        commission += amount;
    }

    public double getSalary(){
        return commission*sale;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Commission : "+ commission);
    }
}
