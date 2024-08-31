package com.basic;

import java.util.Arrays;
import java.util.Comparator;

public class Max_2ndMax {

	public static void main(String[] args) {

		int arr[] = { 8, 1650,2000, 1200, 50, 10, 5, 10, 1100 };

		int max = 0;//8
		int max2 = 0;//8
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max2 = max;
				max = arr[i];
			}else if(arr[i] > max2 && arr[i]!= max){
				max2 = arr[i];
			}
		}
		System.out.println("Max1 no :- "+max);
		System.out.println("Max2 no :- "+max2);

		//using java 8 find 2nd largest no
		int arr1[] = { 8, 1650,2000, 1200, 50, 10, 5, 10, 1100 };
		Integer i = Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println("2nd largest no in array :- "+i);
	}
}
