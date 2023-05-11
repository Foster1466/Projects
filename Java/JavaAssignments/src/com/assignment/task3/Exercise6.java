package com.assignment.task3;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char f='Y';
        do{
            System.out.print("Enter 2 numbers: ");
            int n1 = sc.nextInt(), n2=sc.nextInt();
            int sum=n1+n2;
            System.out.println("Sum: "+sum);
            System.out.print("Do you want to continue (Y/N)? ");
            f = sc.next().charAt(0);
        }while (f=='Y' || f=='y');

    }
}
