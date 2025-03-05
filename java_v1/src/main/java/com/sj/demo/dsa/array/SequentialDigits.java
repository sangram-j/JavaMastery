package com.sj.demo.dsa.array;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public static void main(String[] args) {
        int low = 100, high = 300; //[123,234] sequential digits list
        System.out.println(sequentialDigits(low, high));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int x = i; x <= 9; x++) {
                StringBuilder str = stringBuilder.append(x);

                int num = Integer.parseInt(str.toString());

                if (num >= low && num <= high) {
                    list.add(num);
                }
            }
        }
        return list;
    }
}
