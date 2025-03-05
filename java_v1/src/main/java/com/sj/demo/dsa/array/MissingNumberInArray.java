package com.sj.demo.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 7};

        //when arr length is equal or less than max int in array
        System.out.println(getMissingNumbers(arr));

        int arr1 [] = {1,2,3,5};
        System.out.println(getMissingNum(arr1));


    }

    private static int getMissingNum(int[] arr) {
        int n = arr.length + 1;
        int exepectedSum = n * (n + 1)/2;
        int actualSum = Arrays.stream(arr).sum();
        int missingNum = exepectedSum - actualSum;
        return missingNum;
    }

    public static List<Integer> getMissingNumbers(int arr[]) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            int index = Math.abs(arr[i]) - 1;

            if (arr[index] > 0) {  //if already visited dont change
                arr[index] = -arr[index];   //mark index as visited with -1
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }


}
