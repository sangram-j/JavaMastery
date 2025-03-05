package com.sj.demo.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        //longest substring without repeating characters

        /*Two Pointers Technique:
        start and end represent the sliding window's boundaries within the string.
        end is used to extend the window, while start is used to shrink the window when a duplicate character is encountered.
        */
        String s = "abcaabcbb";
        int start = 0;
        int end = 0;
        int maxLength = 0;
        List<Character> list = new ArrayList<>();

        while (end < s.length()) {

            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println("longest substring without repeating characters:- " + maxLength);


        //using array
        getSubStringUsingArray(s);
        //using HashMap [tough]
        getSubstrUsingHashmap(s);

    }

    public static void getSubstrUsingHashmap(String s) {
        // HashMap to store the last occurrence of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // Variables to track the starting index of the current substring and the maximum length
        int start = 0;
        int maxLength = 0;

        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map and its last occurrence is within the current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                // Move the start pointer to the right of the last occurrence of the current character
                start = map.get(currentChar) + 1;
            }

            // Update the last occurrence of the current character in the map
            map.put(currentChar, end);

            // Calculate the length of the current substring and update maxLength if needed
            maxLength = Math.max(maxLength, end - start + 1);
        }

        // Print the maximum length of the substring without repeating characters
        System.out.println("Longest substring without repeating characters using HashMap: " + maxLength);
    }

    public static void getSubStringUsingArray(String s) {


        /*
        Table: Step-by-step processing of the input string "abcaabcbb"

        +-----+-------+-----------------------------------+------------+-------+-----------+-----------------------+
        | end | Char  | Action/Logic                     | Substring  | start | maxLength | lastIndex Update      |
        +-----+-------+-----------------------------------+------------+-------+-----------+-----------------------+
        |  0  |   a   | Add 'a' to substring             | "a"        |   0   |     1     | lastIndex['a'] = 1    |
        |  1  |   b   | Add 'b' to substring             | "ab"       |   0   |     2     | lastIndex['b'] = 2    |
        |  2  |   c   | Add 'c' to substring             | "abc"      |   0   |     3     | lastIndex['c'] = 3    |
        |  3  |   a   | Move start to 1 (right of 'a')   | "bca"      |   1   |     3     | lastIndex['a'] = 4    |
        |  4  |   a   | Move start to 4 (right of 'a')   | "a"        |   4   |     3     | lastIndex['a'] = 5    |
        |  5  |   b   | Add 'b' to substring             | "ab"       |   4   |     3     | lastIndex['b'] = 6    |
        |  6  |   c   | Add 'c' to substring             | "abc"      |   4   |     3     | lastIndex['c'] = 7    |
        |  7  |   b   | Move start to 6 (right of 'b')   | "cb"       |   6   |     3     | lastIndex['b'] = 8    |
        |  8  |   b   | Move start to 8 (right of 'b')   | "b"        |   8   |     3     | lastIndex['b'] = 9    |
        +-----+-------+-----------------------------------+------------+-------+-----------+-----------------------+
        */
        // Array to store the last seen index of each character
        int[] lastIndex = new int[128]; //[0,0,0,0,0,0,0,0,0,0 initially it will store zero as default
        int start = 0; // Start of the current substring
        int maxLength = 0; // Longest substring length

        //abcaabcbb
        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character was seen before, move the start pointer
            if (lastIndex[currentChar] > start) {
                start = lastIndex[currentChar];
            }

            // Calculate the length of the current substring and update maxLength
            maxLength = Math.max(maxLength, end - start + 1);

            // Update the last seen index of the current character
            lastIndex[currentChar] = end + 1; // Store index + 1 (1-based indexing)
        }

        // Print the result
        System.out.println("Longest substring without repeating characters using array : " + maxLength);

    }
}







