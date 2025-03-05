package com.sj.demo.dsa.array;

import java.util.Arrays;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 8, 3, 1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] arr) {

        //pivot index
        int idx = -1;

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {      //8>7
                idx = i;                //idx = 8 & idx-1 = 7
                break;
            }
        }
        if (idx == -1) {
            reverse(arr, 0, arr.length - 1);
        } else {
            //Find the smallest number larger than nums[idx-1] in the suffix
            int prev = idx;
            //  4,7,8,3,1 -- arr[i] > arr[idx-1] -- 7 > 4
            //  [7,8,3,1]
            for (int i = idx; i < arr.length; i++) {
                if (arr[i] > arr[idx - 1] && arr[i] <= arr[prev]) {
                    prev = i;
                }
            }
            //Swap the pivot and successor
            swap(arr, idx - 1, prev);
        }
        //Reverse the suffix
        reverse(arr, idx, arr.length - 1);

    }

    //helper function
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
