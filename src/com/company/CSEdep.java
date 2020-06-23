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


}
