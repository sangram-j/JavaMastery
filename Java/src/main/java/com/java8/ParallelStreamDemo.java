package com.java8;


import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
/*
        long start = System.currentTimeMillis();
        IntStream.range(0, 50).forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.println("Stream time :- "+(end - start));

        System.out.println("--------------------------------------");

        long start1 = System.currentTimeMillis();
        IntStream.range(0,50).parallel().forEach(System.out::println);
        long end1 = System.currentTimeMillis();
        System.out.println("Parallel Stream time :- "+(end1 - start1));
*/
        IntStream.range(0, 50).forEach(i -> {
            System.out.println("Thread -: " + Thread.currentThread().getName() + " " + i);
        });

        IntStream.range(0, 50).parallel().forEach(i -> {
            System.out.println("Thread -: " + Thread.currentThread().getName() + " " + i);
        });

    }


}
