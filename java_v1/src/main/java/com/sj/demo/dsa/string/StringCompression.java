package com.sj.demo.dsa.string;

import java.util.Arrays;

public class StringCompression {

    public static void main(String[] args) {

        /*Input:
                ["a","a","b","b","c","c","c"]
                Output:
                Return 6, and the first 6 characters of the input array should be:
                ["a","2","b","2","c","3"]
                Explanation:
                "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is
                replaced by "c3".
          */
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compString(chars));

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        getCompString(chars1);
    }

    public static void getCompString(char[] chars) {
        int index = 0; // Position to write in the array
        int i = 0;     // Pointer to read characters

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // Write the character to the array
            chars[index++] = currentChar;

            // If count > 1, write the count as well
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        //return index; // New length of the compressed array
        System.out.println(Arrays.toString(chars));
    }


    public static int compString(char[] chars) {
        int index = 0, i = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[j] == chars[i]) j++;
            chars[index++] = chars[i];
            if (j - i > 1) {
                for (char c : String.valueOf(j - i).toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = j;
        }
        return index;
    }


}
