package com.sj.demo.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class ShootingRange_AlternateRemove {

    //Shooting Range Problem (Remove Alternate Targets and Sum Points)
  /*  Given an array of targets.
    Remove alternate targets from the list.
    Add the removed target values to the total points.
    Continue until only one target remains.
    Return the sum of all removed target values.*/
    public static void main(String[] args) {
        System.out.println(lastPerson(5));//[1,2,3,4,5]
    }

    public static int lastPerson(int n) {
        Queue<Integer> queue = new LinkedList();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int target = queue.poll();
                if (i % 2 == 0) {         //Every alternate person stays
                    result = result + target;
                } else {
                    queue.add(target);
                }
            }
        }
        return result;
    }
}
