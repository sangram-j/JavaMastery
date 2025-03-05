package com.sj.demo.dsa.array;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        String str = "IV";
        System.out.println(romanToInt(str));

    }

    public static int romanToInt(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                result = result - map.get(str.charAt(i));
            } else {
                result = result + map.get(str.charAt(i));
            }
        }
        return result;
    }
}
