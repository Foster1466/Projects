package com.assignment.task6;

public class Triangle {

    private int s1, s2, s3;

    public Triangle(){
        s1 = 3;
        s2 = 4;
        s3 = 5;
    }

    public void printArea(){
        System.out.println("Area: "+(s1*s2*s3));
        System.out.println("Perimeter: "+(s1+s2+s3));
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.printArea();
    }

}
