package com.sj.demo.dsa.string;

public class MissingCharacter {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcde";

        //create frequency array with all default values 0
        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++; //for each char from string update count +1
        }
        for (int i = 0; i < str2.length(); i++) {
            int index = str2.charAt(i) - 'a';
            if (--freq[index] < 0) {     //for each char from another string update count -1
                System.out.println(str2.charAt(i)); //so char which is extra will be -ve count in freq array
            }
        }
    }
}
