package com.demo.array;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintAlternateNo {

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 4, 6, 5, 7, 9, 8, 10};

        //print alternate number
        IntStream.range(0, arr.length).filter(i -> i % 2 == 0).map(i -> arr[i]).forEach(System.out::println);

        //print duplicates
        Integer[] arr1 = {1, 3, 1, 4, 6, 5, 7, 9, 8, 10};
        List<Integer> duplicate = Arrays.stream(arr1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicate);
    }


}
