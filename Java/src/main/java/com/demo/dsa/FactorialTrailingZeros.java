package com.sj.demo.dsa;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        int sum = 0;
        int number = 150;
        while (number / 5 > 0) {
            sum = sum + number / 5;
            number = number / 5;
        }
        System.out.println(sum);
    }
}
