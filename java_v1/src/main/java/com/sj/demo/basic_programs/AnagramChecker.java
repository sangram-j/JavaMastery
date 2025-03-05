package com.sj.demo.basic_programs;

import java.util.HashMap;

public class AnagramChecker {

    //2 string are anagram if they contain same character but in different order
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


        boolean isAnagram = areAnagrams(str1, str2);
        boolean isAnagramFrequencyMethod = areAnagramsUsingFrequencyCount(str1, str2);

        System.out.println("Is " + str1 + " an anagram of " + str2 + "? " + isAnagram);
        System.out.println("Is " + str1 + " an anagram of " + str2 + "? " + isAnagramFrequencyMethod);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Anagrams must be of the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency map for the first string
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Compare against the second string
        for (char ch : str2.toCharArray()) {
            if (!charCountMap.containsKey(ch)) {
                return false; // Character in str2 not in str1
            }
            // Decrease the frequency count
            charCountMap.put(ch, charCountMap.get(ch) - 1);
            if (charCountMap.get(ch) == 0) {
                charCountMap.remove(ch); // Remove the character when count reaches 0
            }
        }

        // If the map is empty, the strings are anagrams
        return charCountMap.isEmpty();
    }

    private static HashMap<Character, Integer> getCharCounterMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }


    /*Frequency Count Using Arrays
    Instead of using a HashMap, you can use an array of size 26 (for lowercase English letters)
    to count the frequencies of characters.
    This method is faster and uses less memory for alphabetic strings.*/

    public static boolean areAnagramsUsingFrequencyCount(String str1, String str2) {
        // Anagrams must be of the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency array for 26 lowercase English letters
        int[] frequency = new int[26];

        // Count characters in str1 and subtract for str2

        /*Subtracting 'a' from the character ensures that 'a' maps to index 0, 'b' maps to index 1, ..., 'z' maps to index 25.
        Subtracting 'a' normalizes the range to [0, 25], making the array compact and easy to manage.
        */
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i) - 'a']++;
            frequency[str2.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }


}
