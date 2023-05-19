package com.assignment.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Exercise9 {

    public static ArrayList<ArrayList<String>> combinations(ArrayList<String> list){
        if (list.size()==0){
            ArrayList<ArrayList<String>> outer = new ArrayList<>();
            ArrayList<String> inner = new ArrayList<>();
            outer.add(inner);
            return outer;
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        String firstEl = list.get(0);
        ArrayList<String> rest = new ArrayList<>(list.subList(1, list.size()));
        ArrayList<ArrayList<String>> withoutFirst = combinations(rest);

        for(ArrayList<String> comb: withoutFirst){
            res.add(comb);
            ArrayList<String> withFirst = (ArrayList<String>) comb.clone();
            withFirst.add(firstEl);
            res.add(withFirst);
        }

        return res;

    }
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList(Arrays.asList("a","b","c"));

        System.out.println(combinations(list));

    }
}
