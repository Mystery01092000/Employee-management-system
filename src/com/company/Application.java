package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        CSEdep cd = new CSEdep("CSE");

        Scanner sc = new Scanner(System.in);

        UI choice = new UI();

        while(true){
            choice.option();
            int op = sc.nextInt();
            if(op==1){
                while(true){
                    choice.subEmployeeOption();
                    int subOp = sc.nextInt();
                    if(subOp==1){
                        System.out.println("Enter new Employee's Name,Id,Designation & Salary respectively: ");
                        sc.nextLine();
                        String n = sc.nextLine();
                        String i = sc.nextLine();
                        String d = sc.nextLine();
                        double s = sc.nextDouble();
                        cd.addNewEmployee(n,i,d,s);
                        break;
                    }
                    else if(subOp==2){
                        System.out.println("Enter new Employee's Name,Id,Designation,Hourly Rate & Hourly Work respectively: ");
                        sc.nextLine();
                        String n = sc.nextLine();
                        String i = sc.nextLine();
                        String d = sc.nextLine();
                        double hr = sc.nextDouble();
                        int hw = sc.nextInt();
                        cd.addNewEmployee(n,i,d,hr,hw);
                        break;
                    }
                    else if(subOp==3){
                        System.out.println("Enter new Employee's Name,Id,Designation,Commission & Sale respectively: ");
                        sc.nextLine();
                        String n = sc.nextLine();
                        String i = sc.nextLine();
                        String d = sc.nextLine();
                        double c = sc.nextDouble();
                        double s = sc.nextDouble();
                        cd.addNewEmployee(n,i,d,c,s);
                        break;
                    }
                    else
                        System.out.println("Wrong key pressed! Please try again.");
                }
            }
            else if(op==2){
                System.out.println("Enter employee's ID: ");
                String i = sc.next();
                double s = cd.getSalary(i);
                if(s!=-1)
                    System.out.println(s);
            }
            else if(op==3){
                System.out.println("Enter employee's ID & the amount need to be raised: ");
                String i = sc.next();
                double d = sc.nextDouble();
                try{
                    cd.increaseSalary(i, d);
                }
                catch(InvalidSalaryException e){
                    JOptionPane.showMessageDialog(null,e.getMessage());
//                    System.out.println(e.getMessage());
//                    e.printStackTrace();
                }
            }
            else if(op==4){
                System.out.println("Enter employee's ID: ");
                String i = sc.next();
                cd.display(i);
            }
            else if(op==5){
                cd.display();
            }
            else if(op==0){
                break;
            }
            else
                System.out.println("Wrong key pressed! Please try again.");
        }
    }
}

