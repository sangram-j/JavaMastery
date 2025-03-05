package com.sj.demo.dsa;

import java.util.Arrays;

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

    }
}
