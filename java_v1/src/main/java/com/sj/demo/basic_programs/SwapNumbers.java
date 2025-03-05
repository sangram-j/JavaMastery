package com.sj.demo.basic_programs;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 13;
        int b = 20;
        a = a + b;//33
        b = a - b;//13
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
