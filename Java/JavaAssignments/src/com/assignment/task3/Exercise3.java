package com.assignment.task3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.next();
        int n = s.length();

        for(int i=0; i<n/2;i++){
            if (s.charAt(i)!=s.charAt(n-i-1)){
                System.out.println("String is not a Palindrome");
            }
        }
        System.out.println("String is a Palindrome");
    }
}
