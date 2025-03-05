package com.sj.demo.multithreading;

public class AlternatePrinting {

    public static void main(String[] args) {
        Object lock = new Object();
        Thread letterThread = new Thread(() -> {
            for (char letter : new char[]{'a', 'b', 'c'}) {
                synchronized (lock) {
                    System.out.print(letter);
                    lock.notify(); // Notify the number thread
                    try {
                        lock.wait(); // Wait for the number thread
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        Thread numberThread = new Thread(() -> {
            for (int number : new int[]{1, 2, 3}) {
                synchronized (lock) {
                    System.out.print(number);
                    lock.notify(); // Notify the letter thread
                    try {
                        if (number != 3) {
                            lock.wait(); // Wait for the letter thread (except after the last number)
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        letterThread.start();
        numberThread.start();
    }
}
