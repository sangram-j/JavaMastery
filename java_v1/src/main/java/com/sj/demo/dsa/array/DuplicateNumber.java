package com.sj.demo.dsa.array;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 4};

        System.out.println(getDuplicate(arr));

        System.out.println(getDuplicateUsingSet(arr));

        System.out.println(getDuplicatesUsingHashMap(arr));
    }

    //floyd algorithm or Tortoise and Hare algorithm
    public static int getDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        // represent given array in linked list cycle form and then use floyd algo
        do {
            slow = arr[slow]; // Moves one step at a time
            fast = arr[arr[fast]]; //Moves two steps at a time
        } while (slow != fast);
        {     //The first do-while loop runs until slow == fast.
            //iterate till get 1st point of intersection after got 1st point fast point will start from zero index and move one position
            fast = arr[0];
        }
        while (slow != fast) { //second loop is used to find the entry point of the cycle
            //iterate till get 2nd point of intersection
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static int getDuplicateUsingSet(int[] arr) {

        HashSet hashSet = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            boolean isAdded = hashSet.add(arr[i]);
            if (!isAdded)
                return arr[i];
        }
        return 0;
    }
    public static int getDuplicatesUsingHashMap(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i < arr.length ; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        for(int i = 0; i < arr.length ; i++) {
            if(hashMap.get(arr[i]) > 1){
                return arr[i];
            }
        }
        return -1;
    }
}
