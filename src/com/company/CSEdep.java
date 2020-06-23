package com.company;

import java.util.ArrayList;

public class CSEdep {
        public String name;

        ArrayList<Employee> employee = new ArrayList<>();

        public CSEdep(String name){

            this.name =  name;
        }

        private void addNewEmployee(Employee e){

            employee.add(e);

            System.out.println("New employee details adding!");
            System.out.println("Successful");
            System.out.println("New employee employed sucessfully");

        }

        public void addNewEmployee(String n, String i, String d, double s){

            SalariedEmployee es =  new SalariedEmployee(n,i,d,s);
            addNewEmployee(es);

        }

        public void addNewEmployee(String n, String i, String d, double hr, int hw){

            HourlyEmployee eh = new HourlyEmployee(n,i,d,hr,hw);

            employee.add(eh);
        }

        public void addNewEmployee(String n,String i,String d,double p,double s){

            CommissionEmployee e = new CommissionEmployee(n,i,d,p,s);

            addNewEmployee(e);
        }

        public Employee findEmployee(String id){
            for(Employee x : employee){
                if(x.getId().equals(id))
                    return x;
            }
            System.out.println("Employee not found!");
            return null;
        }

        public void increaseSalary(String id,double amt) throws InvalidSalaryException{
            Employee x = findEmployee(id);
            if(x!=null){
                x.increaseSalary(amt);
            }
            else
                System.out.println("Employee not found!");
        }
        public double getSalary(String id){
            Employee x = findEmployee(id);
            if(x!=null){
                return x.getSalary();
            }
            System.out.println("Employee not found!");
            return -1;
        }
        public void display(String id){
            Employee x = findEmployee(id);
            if(x!=null){
                x.Display();
            }
        }
        public void display(){
            for(Employee x : employee){
                x.Display();
            }
        }
}
