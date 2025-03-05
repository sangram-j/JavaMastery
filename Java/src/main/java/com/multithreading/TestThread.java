package com.multithreading;

public class TestThread {
    public static void main(String[] args) {
        Chat chat = new Chat();
        new T1(chat);
        new T2(chat);

    }
}
