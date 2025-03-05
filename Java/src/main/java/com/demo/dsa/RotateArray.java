package com.sj.demo.dsa;

import java.util.Arrays;

public class RotateArray {

    //rotate array by k index
    //if index is more than length of array then add one change
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 5;
        System.out.println(Arrays.toString(rotateArray(arr, k)));
    }

    public static int[] rotateArray(int[] arr, int k) {
        k = k % arr.length;
        System.out.println(k);

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        return arr;
    }

    public static void reverse(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}
