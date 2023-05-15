package com.assignment.task5;

public class Exercise3 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        int[] store = new int[26];

        for (int i = 0; i < s.length();i++){
            store[s.charAt(i)-'a']++;
            store[t.charAt(i)-'a']--;
        }
        boolean flag=false;
        for (int n:store){
            if (n!=0){
                System.out.print("String is not Anagram");
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.print("String is Anagram");
        }
    }


}
