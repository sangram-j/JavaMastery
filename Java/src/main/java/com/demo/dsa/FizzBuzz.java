package com.sj.demo.dsa;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(20));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        while (n > 0) {
            if (n % 3 == 0 && n % 5 == 0) {
                list.add("FizzBuzz");
            } else if (n % 3 == 0) {
                list.add("Fizz");
            } else if (n % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(n));
            }
            n--;
        }
        return list;
    }
}
