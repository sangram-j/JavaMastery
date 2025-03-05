package com.sj.demo.dsa.string;

import java.util.HashMap;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String str = "Hellohe".toLowerCase();


        //using Substring
        for (int i = 0; i < str.length() - 1; i++) {
            String substring = str.substring(i, i + 1);
            String remaingstringSuffix = str.substring(i + 1, str.length());
            String remaingstringPrefix = str.substring(0, i);
            if (!remaingstringSuffix.contains(substring) && !remaingstringPrefix.contains(substring)) {
                System.out.println("using Substring:- " + substring);
                break;
            }
        }


        //using frequency array
        /*Time Complexity: O(n) where n is the length of the input string.
         * Space Complexity: O(1)
         * */
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97;
            freq[index] += 1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) { // can use - 97 also
                System.out.println("using frequency array :- " + str.charAt(i));
                break;
            }
        }

        //using hashMap
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
            //map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println("using hashMap :- " + str.charAt(i));
                break;
            }
        }
    }
}
