package com.sj.demo.dsa.string;

public class RansomNote {
    public static void main(String[] args) {

        //Given two strings ransomNote and magazine,
        // return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
        System.out.println(canConstruct("abc", "aaaabbbcccdddhfhhjdjdj"));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            if (arr[ch - 'a'] == 0) {
                return false;
            }
            arr[ch - 'a']--;
        }
        return true;
    }
}
