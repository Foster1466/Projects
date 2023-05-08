package com.assignment.task1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        float radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextFloat();

        double area = 3.14*radius*radius;
        System.out.println("Area of circle is: " + area);
    }
}
