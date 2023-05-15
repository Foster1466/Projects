package com.assignment.task4;

import java.util.Scanner;

public class Exercise4 {

    public static boolean binarySearch(int[] arr, int low, int high, int val){
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==val){
                return true;
            }
            if (arr[mid]>val){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        System.out.print("Enter number to search: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        if (binarySearch(arr, 0, arr.length-1, n)){
            System.out.println("Element present");
        } else {
            System.out.println("Element not present");
        }
    }
}
