package com;


import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        int[] arr = {5,3,2,1};
        int n = arr.length + 1;
        int expectedSum = n * ( n + 1) / 2;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int missingno  = expectedSum - sum;
        System.out.println(missingno);



    }


}


