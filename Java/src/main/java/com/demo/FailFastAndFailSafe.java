package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastAndFailSafe {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// will give concurrent modification exception as modcount value changes
        //List<String> list = new CopyOnWriteArrayList<>();//failsafe wont give exception [ConcurrentHashMap]

        list.add("a");
        list.add("b");
        list.add("e");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
            list.add("c");
        }
        System.out.println(list);
    }
}
