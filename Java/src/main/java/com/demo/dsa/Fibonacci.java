package com.sj.demo.dsa;

public class Fibonacci {

    public static void main(String[] args) {

        //sum of previous two elements
        int n1 = 0, n2 = 1, n3, count = 0;

        System.out.print(n1 + " " + n2);
        while (count < 10) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            count++;
        }
    }
}
