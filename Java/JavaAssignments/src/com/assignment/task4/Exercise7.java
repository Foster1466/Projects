package com.assignment.task4;

public class Exercise7 {

    public static int[] removeDuplicates(int[] input){
        int l = 1;
        for (int r=1;r<input.length;r++){
            if (input[r]!=input[r-1]){
                    input[l]=input[r];
                    l+=1;
            }
        }
        while (l<input.length){
            input[l]=0;
            l+=1;
        }
        return input;
    }
    public static void main(String[] args) {
        int[] input = {2,2,3,3,4,4,4,11,11,11,11};

        System.out.print("Output: ");
        for (int e:removeDuplicates(input)){
            System.out.print(e+" ");
        }
    }
}
