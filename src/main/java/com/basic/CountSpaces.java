package com.basic;

public class CountSpaces {

	public static void main(String[] args) {
		String input="i am a java developer";
		
		
		int counter=0;
		
		for(int i=1;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch==' ') {
				counter++;
			}	
		}
		System.out.println("No of spaces >> "+counter);
	}
}
