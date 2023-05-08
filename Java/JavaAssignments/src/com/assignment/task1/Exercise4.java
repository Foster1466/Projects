package com.assignment.task1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = s.nextInt();
        System.out.print("Enter num2: ");
        num2 = s.nextInt();

        System.out.println("Sum of two numbers is: " + num1+num2);

    }
}
