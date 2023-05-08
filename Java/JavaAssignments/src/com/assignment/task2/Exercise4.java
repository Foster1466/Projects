package com.assignment.task2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        boolean l1 = (year%100!=0) && (year%4==0);      //Every 4 years
        boolean l2 = (year%100==0) && (year%400==0);      //Every 400 years

        if (l1 || l2){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }

    }
}
