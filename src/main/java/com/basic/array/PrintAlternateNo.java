package com.basic.array;


import java.util.stream.IntStream;

public class PrintAlternateNo {

    public static void main(String[] args) {
        int [] arr = {1,3,2,4,6,5,7,9,8,10};

        //print alternate number
        IntStream.range(0,arr.length).filter(i -> i%2==0).map(i ->arr[i]).forEach(System.out::println);
    }


}
