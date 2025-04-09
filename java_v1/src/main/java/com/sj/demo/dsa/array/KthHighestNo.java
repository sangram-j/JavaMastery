package com.sj.demo.dsa.array;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthHighestNo {
    public static void main(String[] args) {

        int arr [] = {1,5,9,2,34,7,0};
        int k = 1;

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int j : arr) {
            queue.add(j);

            if (queue.size() > k) {
                queue.poll();
            }
        }
        System.out.println("nth largest no :- "+queue.poll());


    }
}
