package com.assignment.task7;

import java.util.HashSet;

public class Exercise3 {
    public static void main(String[] args) {
        String s = "abcdefg";
        boolean flag = false;

        HashSet<Character> set = new HashSet<>();
        for (char c:s.toCharArray()){
            if (set.contains(c)){
                flag = true;
            }
            set.add(c);
        }
        if (!flag){
            System.out.println("String is unique");
        }else{
            System.out.println("String is not unique");
        }
    }
}
