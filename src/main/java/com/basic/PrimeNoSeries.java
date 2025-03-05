package com.basic;

public class PrimeNoSeries {

	public static void main(String[] args) {
		for(int no=1; no<100; no++) {
			int count=0;
			for(int a=1;a<=no;a++) {
				int b=no%a;
				if(b==0) {
					count++;
				}
			}if(count==2) {
				System.out.print(" "+ no);
			}
		}
	}
}
