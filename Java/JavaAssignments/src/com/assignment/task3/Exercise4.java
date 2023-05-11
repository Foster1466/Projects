package com.assignment.task3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean flag=false;

        for (int i=2; i<=n/2;i++){
            if (n%2==0){
                System.out.println(n+" is not a prime number");
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(n+" is a prime number");
        }
    }
}
