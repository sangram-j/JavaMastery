package com.oops;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = new Parent();
        Parent parent1 = new Child();

        System.out.println(child.a);
        child.m1();
        System.out.println(parent1.a);
        parent1.m1();


        Employee employee = new Employee(1, "John", new Address("123 Main St", "Latur"));


    }
}
