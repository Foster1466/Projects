package com.assignment.task2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity unit charge: ");
        int unit = sc.nextInt();
        double bill = 0;

        if (unit<=60){
            bill = unit*0.30;
        } else if (unit<=150){
            bill = 60*0.30 + (unit-60)*0.75;
        } else if (unit<=270) {
            bill = 60*0.30 + 90*0.75 + (unit-150)*1.10;
        } else {
            bill = 60*0.30 + 90*0.75 + 120*1.10 + (unit-270)*2.50;
        }

        bill = bill+bill*0.2;

        System.out.println("Total bill: "+bill);
    }
}
