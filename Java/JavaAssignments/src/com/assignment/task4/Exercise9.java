package com.assignment.task4;

import java.util.HashMap;

public class Exercise9 {
    public static int[] findIndex(int[] sample, int target){
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i=0; i<sample.length; i++){
            int num=sample[i];
            int diff = target-num;

            if (seen.containsKey(diff)){
                return new int[] {seen.get(diff), i};
            }
            seen.put(num,i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] sample = {1,4,10,-3};
        int target = 14;

        System.out.print("Indices of two numbers are: ");
        for (int e:findIndex(sample, target)){
            System.out.print(e+" ");
        }
    }
}
