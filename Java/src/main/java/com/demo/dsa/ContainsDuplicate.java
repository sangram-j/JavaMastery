package com.sj.demo.dsa;

import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return true;
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }
}
