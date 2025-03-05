package com.sj.demo.basic_programs;

public class FibonacciSeries {
    public static void main(String args[]) {

        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);// printing 0 and 1

        // loop starts from 2 because 0 and 1 are already printed
        for (i = 2; i < count; i++) { //2<10, 3<10, 4<10, 5<10, 6<10
            n3 = n1 + n2; //n3=0+1=1, n3=1+1=2, n3=1+2=3, n3=2+3=5, n3=3+5=8
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
