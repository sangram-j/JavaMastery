package com.sj.demo.designpatterns.structural.decorator;

public class SMSNotification extends NotificationDecorator{

    public SMSNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        sendSMS(message);
    }
    private void sendSMS(String message){
        System.out.println("Sending SMS: " + message);
    }
}
