package com.assignment.task5;

public class Exercise1 {
    public static void main(String[] args) {
        String input = "Consultadd";
        char[] charStr = input.toCharArray();
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
        System.out.println("Output: "+reverse);
    }
}
