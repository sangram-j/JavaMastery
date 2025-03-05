package com.java8;

public interface AbstractInterface {
    public abstract void m1();
}

class ChildClass {

    public static void main(String[] args) {
        AbstractInterface abstractInterface = () -> System.out.println("ChildClass  :---------");
        abstractInterface.m1();
    }
}
