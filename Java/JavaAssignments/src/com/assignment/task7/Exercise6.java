package com.assignment.task7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Exercise6 {
    public static void main(String[] args) {
        String s = "hippopotamus";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c:s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }

        //System.out.println(map);

        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
