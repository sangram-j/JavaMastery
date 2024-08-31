package com.basic;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int n = 5; // to find factorial of 5

		for (int i = 1; i <= n; i++) { //1, 2, 3, 4, 5
			fact = fact * i; //1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120
		}

		System.out.println(fact);
	}

}
