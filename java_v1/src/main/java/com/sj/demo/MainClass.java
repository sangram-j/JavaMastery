package com.sj.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();


        map.put("sangram",1);
        map.put("jadhav",2);
        map.put("sangram123",9);
        map.put("ram",15);
        map.put("abcf",5);


        List<String> list = map.entrySet()
                .stream().sorted(Map.Entry.comparingByKey()).map(entry-> entry.getKey()).collect(Collectors.toList());
        System.out.println(list);
    }



}
