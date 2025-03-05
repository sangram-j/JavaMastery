package com.designpatterns.singleton;

public class MainClass {

    public static void main(String[] args) {

        SingletonDemo singletonDemo = SingletonDemo.getSingeltonInstance();
        singletonDemo.m1();

        SingletonDemo singletonDemo1 = SingletonDemo.getSingeltonInstance();
        singletonDemo1.m1();

        SingletonDemo singletonDemo2 = SingletonDemo.getSingeltonInstance();
        singletonDemo2.m1();

    }
}
