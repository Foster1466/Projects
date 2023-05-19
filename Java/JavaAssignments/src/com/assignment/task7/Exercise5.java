package com.assignment.task7;

public class Exercise5 {
    public static void main(String[] args) {
        int n = 153;
        String numStr = String.valueOf(n);
        int k = numStr.length();

        int ans = 0;
        while(n>0){
            int digit = n%10;
            ans += Math.pow(digit,k);
            n /= 10;
        }
        if (ans == Integer.valueOf(numStr)){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }

    }



}
