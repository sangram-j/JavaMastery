package com.sj.demo.designpatterns.structural.decorator;

public class NotificationDecorator implements Notification{
    protected Notification  notification;

    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }
    @Override
    public void sendMessage(String message) {
        notification.sendMessage(message);
    }
}
