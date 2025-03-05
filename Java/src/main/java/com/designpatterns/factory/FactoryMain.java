package com.designpatterns.factory;

public class FactoryMain {
    public static void main(String[] args) {

        OperatingFactory factory = new OperatingFactory();
        Profession os = factory.getProfession("Teacher");
        os.print();
    }
}
