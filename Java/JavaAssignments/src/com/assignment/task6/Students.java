package com.assignment.task6;

public class Students {
    private String name;

    public Students(){
        this.name="Unknown";
    }

    public Students(String s){
        this.name=s;
    }

    public void printName(){
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        Students s1 = new Students("Kevin");
        Students s2 = new Students();

        s1.printName();
        s2.printName();
    }

}
