package com;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread extends Thread {
    //static Map<Integer,String> map = new HashMap<>();//Hashmap locks entire map obj ..so no other thread allowed to do operation
    static Map<Integer, String> map = new ConcurrentHashMap<>();//ConcurrentHashMap locks at segment level rather than entire object

    //this is called as segment locking or bucket locking in ConcurrentHashMap
    public void run() {
        try {
            Thread.sleep(1000);
            map.put(4, "d");
        } catch (Exception e) {
            System.out.println("Child thread going to add element");
        }
    }

    public static void main(String args[]) throws InterruptedException {
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        CustomThread th = new CustomThread();
        th.start();


        for (Object ob : map.entrySet()) {
            System.out.println(ob);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }
}
