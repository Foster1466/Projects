package com.assignment.task2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        double total_salary = 0;

        if (salary<=15000){
            total_salary = salary+(salary*0.25)+(salary*0.82);
        } else if (salary<=20200) {
            total_salary = salary+(salary*0.27)+(salary*0.90);
        }else {
            total_salary = salary+(salary*0.36)+(salary*0.95);
        }

        System.out.println("Total Salary is: "+total_salary);
    }
}
