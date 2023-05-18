package com.assignment.task6;

public class Employee {

    private String name;
    private int year;
    private String address;

    public Employee(String name, int year, String address){
        this.name=name;
        this.year=year;
        this.address=address;
    }

    public void printInfo(){
        System.out.println(name+"\t\t"+year+" \t\t\t"+address);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Robert",1994,"64C-Walls Street");
        Employee e2 = new Employee("Sam",2000, "68D-Walls Street");
        Employee e3 = new Employee("John", 1999, "26B-Walls Street");
        System.out.println("Name \tYear of Joining \tAddress");
        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }

}
