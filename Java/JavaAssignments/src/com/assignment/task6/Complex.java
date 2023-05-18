package com.assignment.task6;

import java.util.Scanner;

public class Complex {

    private double real, img;

    public Complex(double real, double img){
        this.real = real;
        this.img = img;
    }

    public Complex sum(Complex c2){
        double realans = real + c2.real;
        double imgans = img + c2.img;

        return new Complex(realans, imgans);
    }

    public Complex diff(Complex c2){
        double realans = real - c2.real;
        double imgans = img - c2.img;

        return new Complex(realans, imgans);
    }

    public Complex prod(Complex c2){
        double realans = real * c2.real;
        double imgans = img * c2.img;

        return new Complex(realans, imgans);
    }

    public void printnum(String s){
        System.out.println(s+real+" + i"+img);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Real and imaginary parts of num1: ");
        double num1 = sc.nextInt(), num2 = sc.nextInt();
        Complex c1 = new Complex(num1, num2);
        System.out.print("Enter Real and imaginary parts of num2: ");
        double num3 = sc.nextInt(), num4 = sc.nextInt();
        Complex c2 = new Complex(num3, num4);

        c1.printnum("num1: ");
        c2.printnum("num2: ");

        Complex c3 = c1.sum(c2);
        c3.printnum("Sum: ");

        Complex c4 = c1.diff(c2);
        c4.printnum("Difference: ");

        Complex c5 = c1.prod(c2);
        c5.printnum("Product: ");
    }

}
