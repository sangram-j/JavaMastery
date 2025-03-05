package com.sj.demo.dsa.array;

public class Palindrome {

    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static int isPalindrome(int n) {
        int temp = n;
        int reversed = 0;
        while (n > 0) {
            int rem = n % 10;

            //overflow condition [optional]
            if (reversed > 0 && reversed > (Integer.MAX_VALUE) - rem / 10 && reversed > (Integer.MIN_VALUE) - rem / 10)
                return 0;

            reversed = reversed * 10 + rem;
            n = n / 10;
        }
        if (temp == reversed)
            System.out.println("Number is palindrome");
        else
            System.out.println("number is not palindrome");
        return reversed;
    }
}
