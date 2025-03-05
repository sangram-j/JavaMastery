package com.sj.demo.designpatterns.structural.decorator;

public class PushNotification extends NotificationDecorator{
    public PushNotification(Notification notification) {
        super(notification);
    }
    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        sendPush(message);
    }
    private void sendPush(String message){
        System.out.println("Sending push notification: " + message);
    }
}
