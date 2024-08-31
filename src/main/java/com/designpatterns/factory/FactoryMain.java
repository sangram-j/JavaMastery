package com.designpatterns.factory;

public class FactoryMain {
    public static void main(String[] args) {

        OperatingFactory factory = new OperatingFactory();
        OS os = factory.getInstance("Open");
        os.spec();
    }
}
