package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StringJoinDemo {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("1", "2", "3", "4");

        String join = String.join("-T ", array);
        System.out.println("String Join -> " + join);


        //skip & limit example(2-9)
        IntStream.range(1, 10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);
    }
}
