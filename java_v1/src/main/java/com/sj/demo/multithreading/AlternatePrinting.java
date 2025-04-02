package com.sj.demo.multithreading;

public class AlternatePrinting {
    private static final Object lock = new Object();
    private static boolean printLetter = true;

    public static void main(String[] args) throws InterruptedException {

        /*Thread letterThread = new Thread(() -> {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                synchronized (lock) {
                    System.out.print(" " + ch);
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
            for (int number = 0; number <= 26; number++) {
                synchronized (lock) {
                    System.out.print(" " + number);
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
        numberThread.start();*/

        //alternate way
        System.out.println("-------------------------------");
        printAlternateNumberLetter();

    }

    public static void printAlternateNumberLetter() throws InterruptedException {
        Thread letterThread = new Thread(() -> {

            for (char ch = 'A'; ch <= 'Z'; ch++) {

                synchronized (lock) {
                    if (!printLetter) {
                        try {
                            lock.wait(); // Wait for the number thread
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(" " + ch);
                    printLetter = false;
                    lock.notify();

                }
            }
        });

        Thread numberThread = new Thread(() -> {

            for (int number = 1; number <= 26; number++) {

                synchronized (lock) {
                    if (printLetter) {
                        try {
                            lock.wait(); // Wait for the letter thread (except after the last number)

                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(" " + number);
                    printLetter = true;
                    lock.notify();

                }
            }
        });

        letterThread.start();
        numberThread.start();

        letterThread.join();
        numberThread.join();

    }
}
