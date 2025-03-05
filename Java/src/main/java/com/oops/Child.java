package com.oops;


public class Child extends Parent {

    int a = 20;

    @Override
    void m1() {

        try {
            System.out.println("Inside Child m1");
            throw new Exception();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws Exception {
        Child child = new Child();
        Parent parent1 = new Child();

        System.out.println(child.a);
        child.m1();
        System.out.println(parent1.a);
        parent1.m1();


    }

}
