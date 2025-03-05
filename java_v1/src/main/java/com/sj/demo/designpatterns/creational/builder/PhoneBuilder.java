package com.sj.demo.designpatterns.creational.builder;


public class PhoneBuilder {
    private String os;
    private String ram;
    private String processor;
    private String screenSize;
    private String battery;

    public String getOs() {
        return os;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getProcessor() {
        return processor;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public String getBattery() {
        return battery;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Phone getphone() {
        return new Phone(os, ram, processor, screenSize, battery);
    }
}
