package com.demo.array;


import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayQues {

    public static void main(String[] args) {
        int[] arr = {-1, -9, 5, -5, 10, -11};

        //print alternate number
        IntStream.range(0, arr.length).filter(i -> i % 2 == 0).map(i -> arr[i]).forEach(System.out::println);

        //avg of positive numbers
        Integer[] arr1 = {-1, -9, 5, -5, 10, -11};

        //using java8
        OptionalDouble average = Arrays.asList(arr1).stream().filter(i -> i > 0).mapToDouble(a -> a).average();
        System.out.println("Average of positive numbers in array :- " + average);

        //traditional approach
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                sum = sum + arr1[i];
                count++;
            }
        }
        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Traditional approach Average of positive numbers in array :-" + avg);
        }

        //swap zero to end of array without changing sequence of other numbers
        int[] arr2 = {0, 0, 2, 5, 4, 7, 0};
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                int temp = arr2[i];//2
                arr2[i] = arr2[j];//0
                arr2[j] = temp;//2
                j++;
                System.out.println("Swapping " + temp + " with " + arr2[j]);

            }
        }
        System.out.println("Array2 after swapping without changing sequence of other numbers" + Arrays.toString(arr2));


    }


}
