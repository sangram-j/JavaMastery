package com.sj.demo.basic_programs;

public class NumberThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread :- " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
