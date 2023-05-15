package com.assignment.task4;

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        double sum = 0;

        for (int e:arr){
            sum+=e;
        }
        System.out.println("Avg: "+sum/arr.length);
    }

}
