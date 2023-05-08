package com.assignment.task2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println("Ans: " + (num1+num2));
                break;
            case '-':
                System.out.println("Ans: " + (num1-num2));
                break;
            case '*':
                System.out.println("Ans: " + (num1*num2));
            case '/':
                System.out.println("Ans: " + (num1/num2));
            default:
                System.out.println("Invalid operation");
        }
    }
}
