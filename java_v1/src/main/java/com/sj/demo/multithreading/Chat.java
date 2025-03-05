package com.sj.demo.multithreading;

public class Chat {
    boolean flag = false;

    public synchronized void question(String msg) {
        if (flag) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting :- ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " :- " + msg);
        flag = true;
        notify();

    }

    public synchronized void answer(String msg) {
        if (!flag) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting :- ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " :- " + msg);
        flag = false;
        notify();
    }
}

class T1 implements Runnable {
    Chat m;
    String[] s1 = {"hi", "how are you", "i am also doing fine"};

    public T1(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    @Override
    public void run() {

        for (int i = 0; i < s1.length; i++) {
            m.question(s1[i]);
        }
    }
}

class T2 implements Runnable {
    Chat m;
    String[] s2 = {"hi", "I am good, what about you", "great"};

    public T2(Chat m2) {
        this.m = m2;
        new Thread(this, "Answer").start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.answer(s2[i]);
        }
    }
}
