package com.sj.demo.dsa.string;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String str[] = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix  :- " + longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String str = arr[0];    //first string
        String str2 = arr[arr.length - 1];  //last string
        int indexPrefix = 0;
        while (indexPrefix < str.length()) {

            if (str.charAt(indexPrefix) == str2.charAt(indexPrefix)) {
                indexPrefix++;
            } else {
                break;
            }
        }
        return indexPrefix == 0 ? "" : str.substring(0, indexPrefix);

    }
}
