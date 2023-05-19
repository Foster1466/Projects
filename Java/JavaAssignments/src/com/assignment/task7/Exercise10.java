package com.assignment.task7;

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        Map<String,String> unsortedMap = new HashMap<>();

        unsortedMap.put("Key1","apple");
        unsortedMap.put("Key2","pineapple");
        unsortedMap.put("Key4","banana");
        unsortedMap.put("Key3","grape");

        System.out.println("Unsorted Map: ");
        for(Map.Entry<String,String> entry:unsortedMap.entrySet()){
            System.out.println("K, V: "+entry.getKey()+ ", "+entry.getValue());
        }

        // Sorting based on keys
        Map<String,String> treeMap = new TreeMap<>(unsortedMap);

        System.out.println("Sorted Map by Keys: ");
        for(Map.Entry<String,String> entry:treeMap.entrySet()){
            System.out.println("K, V: "+entry.getKey()+ ", "+entry.getValue());
        }

        //Sorting based on values
        Set<Map.Entry<String,String>> set = unsortedMap.entrySet();

        List<Map.Entry<String,String>> list = new ArrayList<>(set);

        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo((o2.getValue())));

        System.out.println("Sorted Map by Values: ");
        list.forEach(sorted -> System.out.println("K, V: "+sorted.getKey()+ ", "+sorted.getValue()));

    }
}
