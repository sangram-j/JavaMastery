package com.sj.demo.designpatterns.creational.builder;

public class Phone {

    private String os;
    private String ram;
    private String processor;
    private String screenSize;
    private String battery;

    public Phone(String os, String ram, String processor, String screenSize, String battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
