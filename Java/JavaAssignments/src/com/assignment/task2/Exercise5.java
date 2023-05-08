package com.assignment.task2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();
        char grade = '-';

        if (percentage>90){
            grade = 'A';
        } else if (percentage>75) {
            grade = 'B';
        } else if (percentage>65) {
            grade = 'C';
        }

        System.out.println("Assigned grade is: "+grade);

    }
}
