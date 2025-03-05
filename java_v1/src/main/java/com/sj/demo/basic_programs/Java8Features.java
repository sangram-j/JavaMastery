package com.sj.demo.basic_programs;


interface Calculator {
    //void switchOn();
    //void sum(int input);
    int subtract(int in1, int in2);
}

public class Java8Features {

    public static void main(String[] args) {
        //Lambda expression

        /*Calculator calculator = () -> System.out.println("Switch on");
        calculator.switchOn();*/

        /*Calculator calculator = (input) -> System.out.println("Sum "+input );
        calculator.sum(10);*/

        Calculator calculator = (in1, in2) -> {
            if (in1 > in2) {
                throw new RuntimeException("Invaild input");
            } else {
                return in2 - in1;
            }
        };
        calculator.subtract(10, 20);


    }
}

