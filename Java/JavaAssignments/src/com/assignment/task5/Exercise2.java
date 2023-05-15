package com.assignment.task5;

public class Exercise2 {
    public static void main(String[] args) {
        String input = "Consultadd Pvt";
        String[] inpArr = input.split(" ");
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
        String output = String.join(" ", inpArr);
        System.out.println("Output: "+output);
    }
}
