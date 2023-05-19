package com.assignment.task7;

public class Exercise8 {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,7};
        int max=arr[0];

        for (int i:arr){
            if (max<i){
                max=i;
            }
        }
        System.out.println("Maximum value in array: "+max);
    }
}
