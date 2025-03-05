package com.sj.demo.dsa;

import java.util.Arrays;

public class DuplicateRemoveFromString {
    public static void main(String[] args) {
        //remove duplicates from String without changing its sequence
        String input = "hello";

        // StringBuilder to store the result (the string without duplicates)
        StringBuilder ans = new StringBuilder("");

        //reverse the string
        System.out.println(new StringBuilder(input).reverse());


        // Array to track character occurrences; assuming all characters are lowercase English letters
        int[] arr = new int[26];

        for (int i = 0; i < input.length(); i++) {
            // Calculate the index of the character in the array based on its ASCII value
            // 'a' has an ASCII value of 97, so subtracting 97 converts 'a' to index 0, 'b' to index 1, etc.
            int index = input.charAt(i) - 97;

            System.out.println("index :- " + index);

            // Increment the count of the character in the array
            arr[index] += 1;//arr[index]+1;

            System.out.println("array :- " + Arrays.toString(arr));

            // If this is the first occurrence of the character (arr[index] == 1),
            // add it to the result StringBuilder
            if (arr[index] == 1) {
                ans.append(input.charAt(i));
            }
        }

        System.out.println("Input String after :- " + ans);
    }
}
