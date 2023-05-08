package com.assignment.task2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n<0){
                System.out.println("It's Over");
                break;
            }else{
                System.out.println("Good Going");
            }
        }
    }
}
