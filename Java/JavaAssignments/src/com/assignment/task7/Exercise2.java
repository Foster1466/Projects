package com.assignment.task7;

import java.util.HashSet;

public class Exercise2 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};

        HashSet<Integer> set1 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i:nums2){
            set2.add(i);
        }

        HashSet<Integer> main_set = new HashSet<>();
        for (Integer var:set1){
            if (set2.contains(var)){
                main_set.add(var);
            }
        }
        int[] arr = new int[main_set.size()];
        int i=0;
        for (Integer val:main_set){
            arr[i]=val.intValue();
            i+=1;
        }
        System.out.print("Intersected array: ");
        for (int v:arr){
            System.out.print(v+" ");
        }
    }

}
