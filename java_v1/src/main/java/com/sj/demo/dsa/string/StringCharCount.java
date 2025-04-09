package com.sj.demo.dsa.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCharCount {
    public static void main(String[] args) {

        /*count each char frequency and append in existing string*/

        String str ="aabbbcddddee";
        StringBuilder result = new StringBuilder();
        List<String> list = Arrays.asList(str.split(""));

        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            result.append(entry.getKey());
            result.append(entry.getValue());
        }
        System.out.println(result);
    }
}
