package com.sj.demo.dsa.array;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class MoveDuplicates {

    public static void main(String[] args) {
        //move duplicates to end of array
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};

        int index = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[index++] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
        moveDuplicatesToEnd(arr1);

    }


    public static void moveDuplicatesToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        int uniqueIndex = 0, duplicateIndex = n - 1;

        // Identify unique elements
        for (int num : arr) {
            if (!set.contains(num)) {
                temp[uniqueIndex++] = num; // Store unique elements at the front
            }
            set.add(num);
        }

        // Identify duplicate elements
        for (int num : arr) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                temp[duplicateIndex--] = num; // Store duplicates at the end
            }
        }

        // Copy back to original array
        System.arraycopy(temp, 0, arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}
