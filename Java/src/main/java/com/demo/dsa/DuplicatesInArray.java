package com.sj.demo.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInArray {//https://www.youtube.com/watch?v=ACYunkWQnSI

    public static void main(String[] args) {
        int arr[] = {1, 4, 8, 2, 3, 6, 8, 6};
        System.out.println(getDuplicates(arr).toString());
        int arr1[] = {1, 4, 8, 2, 3, 6, 8, 6};
        System.out.println(getDuplicateUsingList(arr1).toString());
        Integer arr2[] = {1, 4, 8, 2, 3, 6, 8, 6};
        System.out.println(getDuplicateNumbersUsingGenerics(arr2));
        String arr3[] = {"sj", "ab", "sj"};
        System.out.println(getDuplicateNumbersUsingGenerics(arr3));
    }

    public static List<Integer> getDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1; //index to be marked as visited Math.absolute ensures that even if a number in the array is negative the correct index is computed.
            if (arr[index] < 1) { //index value -ve means already visited i.e. duplicate
                list.add(Math.abs(arr[i]));
            }
            arr[index] = -arr[index]; //mark index as visited i.e. marking index value as -ve
        }
        return list;
    }

    public static List<Integer> getDuplicateUsingList(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // Update frequency in the map

            if (map.get(arr[i]) > 1)
                list.add(arr[i]);
        }

        return list;
    }

    //optimized solution using generics
    public static <T> Set<T> getDuplicateNumbersUsingGenerics(T[] arr) {
        Set<T> set = new HashSet<>();
        return Arrays.stream(arr).filter(val -> !set.add(val))
                .collect(Collectors.toSet());
    }
}
