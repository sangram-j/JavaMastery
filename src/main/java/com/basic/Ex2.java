package com.basic;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Find number of zeroes in given number array and moving them to end without
		 * changing sequence of other non-zero numbers. 
		 * Example: input :[1, 4, 0, 23, 0, 0, 21, 0, 6, 78, 0] 
		 * output :[1, 4, 23, 21, 6, 78, 0, 0, 0, 0, 0]
		 */
		
		int[] arr = { 1, 4, 0, 23, 0, 0, 21, 0, 6, 78, 0 };
		//			  0  1  2  3   4  5  6   7  8  9   10
		
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] == 0) { //arr[2]=0
//Swap logic used
					temp=arr[j]; //temp=0
					arr[j]=arr[j+1]; //arr[2]=23
					arr[j+1]=temp; //arr[3]=0
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
