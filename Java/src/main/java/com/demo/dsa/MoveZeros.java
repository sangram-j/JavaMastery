package com.sj.demo.dsa;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 5, 0, 2, 0, 6, 9, 0, 0};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeros(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[counter++] = arr[i];
            }
        }
        while (counter < arr.length) {
            arr[counter++] = 0;
        }
    }
}
