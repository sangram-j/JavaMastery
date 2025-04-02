package com.sj.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) throws Exception{

        String str = "Sangram Jadhav";

        List<Map.Entry<String, Long>> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(ent->ent.getValue()>1)
                .collect(Collectors.toList());
        System.out.println(collect);
    }



}
