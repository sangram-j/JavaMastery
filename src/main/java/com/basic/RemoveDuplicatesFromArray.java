package com.basic;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 50, 20, 30, 30, 40, 50, 50 ,20};
		Arrays.sort(arr);
		int j = 0;// for next element
		for (int i = 0; i < arr.length -1 ; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i]; //j++ incremented after putting value at j index
				System.out.println(arr[i]);
			}
		}
		int a = arr[j++] = arr[arr.length - 1];
		System.out.println(a);

		System.out.println("Final Output array :- "+Arrays.toString(Arrays.copyOf(arr,j )));


		//2nd solution
		int [] output = removeDuplicates(arr);
		System.out.println("Final Output array from removeDuplicates :- "+Arrays.toString(output));

		//3rd solution
		removeDuplicatesUsingString(arr);

	}

	private static void removeDuplicatesUsingString(int[] arr) {
		String s = "";
		for (int i : arr) {
			if(!s.contains(String.valueOf(i))){
				s=s+" "+i;
			}
		}
		System.out.println("removed Duplicates Using String "+s);
	}

	public static int[] removeDuplicates(int[] array) {

		// Sort the array
		Arrays.sort(array);

		// Initialize variables for tracking unique elements and duplicates
		int uniqueCount = 1;
		//int previous = array[0];

		// Iterate through the array, comparing adjacent elements
		for (int i = 1; i < array.length-1; i++) {
			if (array[i] != array[i+1]) {
				// If current element is different from the previous one,
				// update previous and increment uniqueCount
				array[uniqueCount++] = array[i];
			}
		}
		int a = array[uniqueCount++] = array[array.length - 1];

		// Create a new array to store unique elements
		int[] result = Arrays.copyOf(array, uniqueCount);

		return result;
	}
}
