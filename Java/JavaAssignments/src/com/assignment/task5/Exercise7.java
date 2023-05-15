package com.assignment.task5;

import java.util.HashSet;
import java.util.Set;

public class Exercise7 {

    public static boolean isogram(String s){
        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }

    public static String reverseString(String s){
        String[] inpArr = s.split(" ");
        for (int i=0;i<inpArr.length;i++){
            char[] charStr = inpArr[i].toCharArray();
            int l=0, r=charStr.length-1;
            char tmp = '/';
            while (l<r){
                tmp = charStr[l];
                charStr[l]=charStr[r];
                charStr[r]=tmp;
                l+=1;
                r-=1;
            }
            String reverse = new String(charStr);
            inpArr[i]=reverse;
        }
        return String.join(" ", inpArr);
    }

    public static void main(String[] args) {
        String s = "Be Happy and Stay Motivated";

        if (isogram(s)){
            System.out.println("String is unique");
        } else {
            System.out.println("String is not unique");
        }

        System.out.println("Reversed String: "+reverseString(s));
    }
}
