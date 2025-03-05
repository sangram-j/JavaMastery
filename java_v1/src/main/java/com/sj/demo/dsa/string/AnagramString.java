package com.sj.demo.dsa.string;

import java.util.*;

public class AnagramString {

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagamra";

        //check 2 strings
        System.out.println(isAnagram(str1, str2));

        String[] words = {"listen", "silent", "enlist", "hello", "olleh", "world", "dlrow"};
        //checked array of words
        System.out.println(findAnagramPairs(words));
    }


    private static boolean isAnagram(String s, String t) {

        int[] frqArr = new int[26];

        //length check
        if (s.length() != t.length()) {
            return false;

        } else {
            for (int i = 0; i < s.length(); i++) {
                frqArr[s.charAt(i) - 97]++;
            }
            for (int i = 0; i < t.length(); i++) {
                frqArr[t.charAt(i) - 97]--;
            }
            for (int i = 0; i < frqArr.length; i++) {
                if (frqArr[i] != 0) {
                    System.out.println("not anagram ");
                    return false;
                }
            }
        }

        return true;
    }

    public static List<List<String>> findAnagramPairs(String[] str) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String word : str) {
            String freqString = getFreqString(word);

            /*if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>());
            }
            anagramGroups.get(key).add(word);*/

            //If the key exists: It returns the associated value.
            //If the key does not exist: It computes a value using the provided lambda expression,
            // inserts the key-value pair into the map, and then returns the computed value.

            anagramGroups.computeIfAbsent(freqString, k -> new ArrayList<>()).add(word);
        }
        //grouped anagrams -> list of lists
        return new ArrayList<>(anagramGroups.values());

    }

    public static String getFreqString(String str) {
        int[] arr = new int[26];
        for (char ch : str.toCharArray()) {
            arr[ch - 'a']++;   //arr[c-97]++;
        }
        return Arrays.toString(arr);
    }
}
