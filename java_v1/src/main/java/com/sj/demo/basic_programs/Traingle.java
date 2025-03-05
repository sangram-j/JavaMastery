package com.sj.demo.basic_programs;

// Right angle traingle pattern & uncomment line no 9,10,11 for Pyramid pattern
// if we interchange line no 10 & 14 then reverse pyramid will get
public class Traingle {
    public static void main(String[] args) {
        int row = 6;

        for (int i = 1; i <= row; i++) { // outer loop work for rows

			/*for (int k = i; k < row; k++) {// inner loop work for space
				System.out.print(" ");
			}*/

            for (int j = 1; j <= i; j++) { // inner loop for columns
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
