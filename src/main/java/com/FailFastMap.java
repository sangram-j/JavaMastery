package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {
    public static void main(String[] args) {
        //Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"a");
        map.put(2,"b");

        Iterator itr = map.keySet().iterator();
        while (itr.hasNext()){
            Integer in = (Integer) itr.next();
            System.out.println(in);
            map.put(3,"c");
        }

    }
}
