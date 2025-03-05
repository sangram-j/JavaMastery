package com.sj.demo.designpatterns.structural.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Basic Email Notification
        Notification email = new EmailNotification();
        System.out.println("Basic Email Notification:");
        email.sendMessage("Hello User!");

        System.out.println("\nEmail + SMS Notification:");
        Notification emailWithSMS = new SMSNotification(new EmailNotification());
        emailWithSMS.sendMessage("Hello User!");

        System.out.println("\nEmail + SMS + Push Notification:");
        Notification emailWithSMSAndPush = new PushNotification(new SMSNotification(new EmailNotification()));
        emailWithSMSAndPush.sendMessage("Hello User!");
    }
}
