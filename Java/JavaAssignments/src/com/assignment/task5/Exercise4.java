package com.assignment.task5;

public class Exercise4 {
    public static void main(String[] args) {
        String s = "consultadd!";
        char c = 'o';
        int count = 0;

        for (int i=0;i<s.length();i++){
            if (c==s.charAt(i)){
                count+=1;
            }
        }
        System.out.print("Given Character count is: "+count);
    }
}
