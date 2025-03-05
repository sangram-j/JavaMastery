package com.sj.demo.dsa;

public class PalindromeString {
    public static void main(String[] args) {
        //Given a string s, return true if it is a palindrome, or false otherwise.
        //97-122 = a-z     48-57 = 0-9

        String str = "10 A man, a plan, a canal : Panama 01".toLowerCase();
        System.out.println(isPalindrome(str));

    }

    private static boolean isPalindrome(String str) {

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 97 && str.charAt(i) <= 122) && (str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
                strBuilder.append(str.charAt(i));
            }
        }
        for (int i = 0; i < strBuilder.length() / 2; i++) {
            if (strBuilder.charAt(i) != strBuilder.charAt(strBuilder.length() - 1 - i)) {
                System.out.println("this is not palindrome string");
                return false;
            }
        }
        return true;
    }
}
