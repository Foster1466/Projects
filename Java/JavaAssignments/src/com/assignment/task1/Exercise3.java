package com.assignment.task1;

public class Exercise3 {
    public static void main(String[] args) {
        // Using result variable
        int n1=10, n2=2;
        int result;

        result = n1;
        n1 = n2;
        n2 = result;
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        // Without using variable
        int a=10, b=2;
        int sum = a+b;
        a = sum-a;
        b = sum-b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
