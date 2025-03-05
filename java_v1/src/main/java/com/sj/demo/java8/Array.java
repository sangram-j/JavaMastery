package com.sj.demo.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        getMissingnumber(arr);

        int[] arr1 = {1, 2, 3, 4, 5, 2, 3};
        System.out.println(getDuplicates(arr1));

        //Find the First Non-Repeating Element
        int[] arr2 = {4, 5, 1, 2, 0, 4, 5, 2};
        System.out.println(findFirstUnique(arr2));

        //Sort an Array in Descending Order
        int[] arr3 = {5, 2, 8, 1, 3};
        System.out.println(Arrays.toString(sortArray(arr3)));

        int[] arr4 = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(arr4);

        //Find the Kth Largest Element in an Array
        int[] arr5 = {3, 2, 1, 5, 6, 4};
        findKthLargest(arr5);

        //find sum of two largest no in array
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7};
        findSum(arr6);
    }

    private static void findSum(int[] arr6) {
        Integer sum = Arrays.stream(arr6).boxed()
                .sorted((a, b) -> b - a)
                .limit(2)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }

    private static void findKthLargest(int[] arr) {
        int k = 2; // Find 2nd largest

        Integer kthLargest = Arrays.stream(arr).boxed()
                .sorted((a, b) -> b - a)
                .skip(k - 1)
                .findFirst()
                .orElse(-1);
        System.out.println(kthLargest);
    }

    public static void rotateArray(int [] arr){
        int k = 3; //rotate array by 3

        k = k % arr.length;
        int[] rotated = IntStream.concat(
                Arrays.stream(arr, arr.length - k, arr.length),
                Arrays.stream(arr, 0, arr.length)
        ).toArray();
        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }
    public static int [] sortArray(int [] arr){
        return Arrays.stream(arr).boxed()
                .sorted((a, b) -> b - a) //Descending -- [a - b -> ascending]
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static Integer findFirstUnique(int[] arr2) {
        return Arrays.stream(arr2).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);
    }

    public static void getMissingnumber(int [] arr){
        int n = arr.length + 1;
        int sumExpected = IntStream.rangeClosed(1, n).sum();
        int sum = IntStream.of(arr).sum();

        System.out.println(sumExpected-sum);
    }
    public static List<Integer> getDuplicates(int [] arr){
        return Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry :: getKey)
                .collect(Collectors.toList());
    }


}
