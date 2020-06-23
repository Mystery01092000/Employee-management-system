package com.company;

public abstract class Employee {
    private String name;
    private String id;
    private String Designation;


    public Employee(String name, String id, String Designation){

        this.name = name;
        this.id = id;
        this.Designation = Designation;

    }

    public void Display(){

        System.out.println("Name : "+name);
        System.out.println("Id : "+ id);
        System.out.println("Designation : "+Designation);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return Designation;
    }

    public String getId() {
        return id;
    }

}
