package com.sj.demo.basic_programs;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {9, 8, 2, 1, 4, 3, 7, 6, 5};
        System.out.println(Arrays.toString(input));
        bubbleSort(input);
    }

    private static void bubbleSort(int[] arr) {
        int temp;
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    //System.out.println(Arrays.toString(arr));
                }
            }
            if (!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
