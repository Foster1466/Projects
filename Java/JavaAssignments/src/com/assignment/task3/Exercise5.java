package com.assignment.task3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), sum = 0, i=1;

        while (i<=n){
            if (i%2==0){
                sum+=i;
            }
            i+=1;
        }
        System.out.println("Sum: "+sum);
    }
}
