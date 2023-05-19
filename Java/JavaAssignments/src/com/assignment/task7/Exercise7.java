package com.assignment.task7;

import java.util.*;

public class Exercise7 {

    public static List<List<String>> permute(String[] s){
        List<List<String>> ans = new ArrayList<>();
        function(ans, s, 0);
        return ans;

    }

    public static void function(List<List<String>> ans, String[] arr, int start){
        if (start==arr.length){
            List<String> list = new ArrayList<>();
            for (int i=0;i<arr.length;i++) list.add(arr[i]);
            ans.add(list);
            return;
        }

        for (int i=start; i<arr.length; i++){
            swap(arr,start,i);
            function(ans, arr, start+1);
            swap(arr, start, i);
        }
    }

    public static void swap(String[] arr, int a, int b){
        String tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        String[] s = {"a", "b", "c"};
        System.out.println(permute(s));
    }
}
