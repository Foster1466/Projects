package com.assignment.task3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), res=1;

        for(int i=n;i>0;i--){
            res *= i;
        }
        System.out.println("Result: " + res);
    }
}
