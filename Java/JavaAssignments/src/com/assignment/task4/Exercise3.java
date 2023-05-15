package com.assignment.task4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        System.out.print("Enter number to search: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag=false;
        for (int e:arr){
            if (e==n){
                System.out.println("Element present");
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Element not present");
        }
    }

}
