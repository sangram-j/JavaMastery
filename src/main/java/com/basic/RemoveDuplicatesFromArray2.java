package com.basic;

import java.util.Arrays;

public class RemoveDuplicatesFromArray2 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
//	distinct() method used to remove duplicates 
		int arr1[] = Arrays.stream(arr).distinct().toArray();
		for (int i : arr1) {
			System.out.println(i);
		}
	}

}
