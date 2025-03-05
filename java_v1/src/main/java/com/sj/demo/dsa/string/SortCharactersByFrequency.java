package com.sj.demo.dsa.string;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String str = "aazzzzzzzzzzzbbbcccc";
        System.out.println(sortCharByFreq(str));
    }

    public static String sortCharByFreq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        /*By default, a PriorityQueue in Java is a min-heap, which means the smallest element is at the top.
        To create a max-heap, you need to reverse the natural order by providing a custom comparator.
        In this case, the custom comparator ensures that characters with higher frequencies appear at the top of the queue.*/

        PriorityQueue<Character> pq = new PriorityQueue((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            result.append(String.valueOf(c).repeat(map.get(c)));
        }
        return result.toString();
    }

}
