package com.sj.demo.dsa;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String str[] = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix  :- " + longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String str = arr[0];
        String str2 = arr[arr.length - 1];
        int index = 0;
        while (index < str.length()) {

            if (str.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : str.substring(0, index);

    }
}
