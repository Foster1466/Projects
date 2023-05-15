package com.assignment.task5;

import java.awt.*;
import java.util.HashMap;
import java.util.Stack;

public class Exercise8 {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketLookup = new HashMap<>();

        bracketLookup.put(')','(');
        bracketLookup.put('}','{');
        bracketLookup.put(']','[');

        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (bracketLookup.containsKey(c)){
                if (!stack.isEmpty() && bracketLookup.get(c).equals(stack.peek())){
                    stack.pop();
                }else{
                    return false;
                }
            } else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "({{}})()";
        String s2 = "{{( [ ) ] }}";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
}
