package com.java8;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

    public static void main(String[] args) {

        //consumer interface used to take input - perform operation without returning any result
        List<Integer> list = Arrays.asList(1, 2, 4, 7, 9, 0, 3, 7);
        list.stream().filter(t -> t % 2 == 0).forEach(l -> System.out.println("Print :- " + l));
    }
}
