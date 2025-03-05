package com.demo.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramPairs {
  /*  Input: [“eat”, “tea”, “tan”, “ate”, “nat”, “bat”]
    Output: [[“bat”], [“nat”, “tan”], [“ate”, “eat”, “tea”]]*/

    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        List<List<String>> result = findAnagramPairs(list);
        System.out.println(result);
    }

    private static List<List<String>> findAnagramPairs(List<String> list) {
        List<List<String>> result = new ArrayList<>();
        char[] charArray = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            char[] childCharArray = list.get(i).toCharArray();
            Arrays.sort(childCharArray);
        }
        System.out.println(Arrays.toString(charArray));
        return result;
    }
}
