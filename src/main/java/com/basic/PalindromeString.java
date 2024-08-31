package com.basic;

public class PalindromeString {

public static void main(String args[]){
		
		String str = "racecar";
		int counter=0;
		for(int i=0; i<= str.length()/2; i++){
			
			if(str.charAt(i) == str.charAt(str.length()-1-i)){
				
				counter++;
			}
			
		}
			if(counter == 0){
				System.out.println("String is not palindrome");
			}else{
				System.out.println("String is palindrome");
			}
	}
}
