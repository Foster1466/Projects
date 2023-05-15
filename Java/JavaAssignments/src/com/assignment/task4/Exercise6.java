package com.assignment.task4;

import java.util.HashMap;

public class Exercise6 {

    public static int[] findNumbers(int[] sample, int target){
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i=0; i<sample.length; i++){
            int num=sample[i];
            int diff = target-num;

            if (seen.containsKey(diff)){
                return new int[] {diff, sample[i]};
            }
            seen.put(num,i);
            System.out.println(seen);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] sample = {1,2,4,5,6};
        int target = 6;

        System.out.println("Elements are: ");
        for (int e:findNumbers(sample, target)){
            System.out.print(e+" ");
        }
    }
}
