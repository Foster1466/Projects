package com.assignment.task3;

public class Exercise10 {
    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for (int j=i+1;j<n;j++){
                System.out.print(" ");
            }
            for (int j=n+i+1;j<n+n;j++){
                System.out.print(" ");
            }
            for (int j=n;j<n+i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
