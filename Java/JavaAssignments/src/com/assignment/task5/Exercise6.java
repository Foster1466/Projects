package com.assignment.task5;

public class Exercise6 {
    public static void main(String[] args) {
        String s = "This is an example string";
        String sub = "exaa";

        if (s.contains(sub)){
            System.out.println("Substring '"+sub+"' is present in the string");
        } else {
            System.out.println("Substring '"+sub+"' is not present in the string");
        }
    }
}
