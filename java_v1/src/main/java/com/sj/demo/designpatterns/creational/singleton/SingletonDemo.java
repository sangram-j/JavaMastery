package com.sj.demo.designpatterns.creational.singleton;

public class SingletonDemo {

    //eager loading
    private static SingletonDemo singeltonInstance;

    //make constructor private so that no obj created by using new keyword
    private SingletonDemo() {

    }

    //remove setter methods
    //lazy loading
    public static SingletonDemo getSingeltonInstance() {

        if (singeltonInstance == null) {
            System.out.println("is null");
            singeltonInstance = new SingletonDemo();
        }
        return singeltonInstance;
    }

    public void m1() {
        System.out.println("Printing hashcode of singleton obj :- " + singeltonInstance);
    }

    public static void main(String[] args) {
        SingletonDemo singletonDemo1 = new SingletonDemo();
        singletonDemo1.m1();

        SingletonDemo singletonDemo = SingletonDemo.getSingeltonInstance();
        singletonDemo.m1();

        SingletonDemo singletonDemo2 = SingletonDemo.getSingeltonInstance();
        singletonDemo2.m1();

        SingletonDemo singletonDemo3 = new SingletonDemo();
        singletonDemo1.m1();

    }


}
