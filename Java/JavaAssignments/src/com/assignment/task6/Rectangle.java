package com.assignment.task6;

public class Rectangle {
    private int length, breadth;

    public Rectangle(){
        this.length=0;
        this.breadth=0;
    }

    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(int val){
        this.length=val;
        this.breadth=val;
    }

    public double area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4,3);
        Rectangle r3 = new Rectangle(6);

        System.out.println("Area of rectangle r1: "+r1.area());
        System.out.println("Area of rectangle r2: "+r2.area());
        System.out.println("Area of rectangle r3: "+r3.area());
    }
}
