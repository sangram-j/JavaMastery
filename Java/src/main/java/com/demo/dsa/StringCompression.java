package com.sj.demo.dsa;

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

    public static void getCompString(char[] arr) {
        int ans = 0; // keep track of current position in compressed array

        // iterate through input array using i pointer
        for (int i = 0; i < arr.length; ) {
            char letter = arr[i]; // current character being compressed
            int count = 0;  // count of consecutive occurrences of letter

            // count consecutive occurrences of letter in input array
            while (i < arr.length && arr[i] == letter) {
                ++count;
                ++i;
            }

            // write letter to compressed array
            arr[ans++] = letter;

            //if count is greater than 1 then write count as string to compressed array
            if (count > 1) {
                // convert count to string and iterate over each character in string
                for (char c : String.valueOf(count).toCharArray()) {
                    arr[ans++] = c;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
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
