package com.assignment.task7;

public class Exercise1 {

    public static char findchar(String s){
        int[] count = new int[26];

        for (char c:s.toCharArray()){
            count[c-'a']++;
        }
        for (char c: s.toCharArray()){
            if (count[c-'a']==1){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String s = "sfnkjbnjksf";
        char c = findchar(s);

        System.out.println(c);
    }
}
