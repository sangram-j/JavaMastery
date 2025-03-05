package com.sj.demo.designpatterns.creational.builder;


public class Shop {

    public static void main(String[] args) {
        //Phone ph = new Phone();
        Phone phone = new PhoneBuilder().setOs("os").setRam("2gb").getphone();
        System.out.println(phone);
    }
}
