package com.designpatterns.factory;

public class Teacher implements Profession {

    @Override
    public void print() {
        System.out.println("In print of Teacher class");
    }
}
