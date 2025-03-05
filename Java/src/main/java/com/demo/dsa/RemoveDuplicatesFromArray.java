package com.sj.demo.dsa;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6};
        System.out.println(removeDuplicates(nums));

        Arrays.stream(nums).distinct().toArray();


    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length < 1) return arr.length;

        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[index - 1] != arr[i]) {
                arr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return index;
    }
}
