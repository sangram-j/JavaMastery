package com.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharFromString {
    public static void main(String[] args) {
        String input = "ilovenavimumbai";
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //traditional way
        int counter = 0;
        String[] in = input.split("");
        System.out.println(Arrays.toString(in));
        //[i, l, o, v, e, n, a, v, i, m, u, m, b, a, i]
        for (int i = 0; i < in.length; i++) {
            counter = 1;
            for (int j = i + 1; j < in.length; j++) {
                if (in[i].equals(in[j])) {
                    counter++;
                    in[j] = "0";
                }
            }
            if (in[i] != "0") {
                System.out.println(in[i] + " -> " + counter);
            }
        }
        System.out.println(Arrays.toString(in));
    }

}
