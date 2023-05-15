package com.assignment.task4;

import java.util.Scanner;

public class Ecercise1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        for (int e:arr){
            System.out.print(e+" ");
        }
    }
}
