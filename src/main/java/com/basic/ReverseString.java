package com.basic;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String str = "this is dell laptop";
		String arr[] = str.split(" ");
		String rev = "";
		Arrays.stream(arr).forEach(System.out::println);
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i] + " ";
			
		}
		System.out.println(rev);
	}
}
