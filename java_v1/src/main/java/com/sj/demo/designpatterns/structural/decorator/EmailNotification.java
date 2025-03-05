package com.sj.demo.designpatterns.structural.decorator;

public class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
