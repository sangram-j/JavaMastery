package com.java8;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList();
        //supplier used where there is no input but output is expected
        System.out.println(list.stream().filter(t -> t==10).findAny().orElseGet(()-> 0));

    }
}
