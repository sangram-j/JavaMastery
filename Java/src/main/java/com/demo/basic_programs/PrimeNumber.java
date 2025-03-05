package com.sj.demo.basic_programs;

public class PrimeNumber {

    public static void main(String[] args) {

        int no = 7; // to check whether 7 is prime or not
        int count = 0;

        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is prime");
        }
    }
}
