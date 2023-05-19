package com.assignment.task7;

import java.util.HashMap;

public class Exercise11 {

    static int subarraySum(int[] nums, int k){
        int res = 0, sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            int diff = sum-k;
            res += map.getOrDefault(diff,0);

            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k=3;
        System.out.println(subarraySum(nums, k));
    }
}
