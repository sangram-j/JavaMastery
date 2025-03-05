package com.sj.demo.designpatterns.creational.factory;


public class Doctor implements Profession {

    @Override
    public void print() {
        System.out.println("In print of Doctor class");
    }
}
