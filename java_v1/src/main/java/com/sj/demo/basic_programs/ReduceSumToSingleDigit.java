package com.sj.demo.basic_programs;

public class ReduceSumToSingleDigit {

    public static void main(String[] args) {
         /*summing all elements in the array and then repeatedly reducing the sum to a single-digit number
        by summing its digits (similar to the digital root concept).*/

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int rem = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
            //System.out.println("1 : "+sum + " "+ arr[i]);
            while (sum >= 10){
                rem = sum % 10;
                sum = sum / 10;
                sum = sum + rem;
                //System.out.println("2 : "+sum);
            }

        }
        //System.out.println("3 : "+sum);
    }
}
