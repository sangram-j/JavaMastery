package com.basic;

public class Reverse {
	
	public static void main(String[] args) {
		
		int number=6079;
		int reverse;
		for(reverse=0; number != 0; number=number/10) {
			int remainder= number%10; //9, 7, 0, 6
			reverse= reverse*10 +remainder; //9, 97, 970, 9706 
			
		}System.out.println(reverse);
	}
}
