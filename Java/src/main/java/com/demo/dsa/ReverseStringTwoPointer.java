package com.sj.demo.dsa;

public class ReverseStringTwoPointer {
    public static String reverseUsingTwoPointers(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    public static String reverseWordsUsingTwoPointer(String sentence) {
        // Trim the input to remove extra spaces at the start or end
        sentence = sentence.trim();

        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");

        // Reverse the words array
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Join the words back into a single string
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String input = "Hello World in Java";
        String reversed = reverseUsingTwoPointers(input);
        String reversedSentence = reverseWordsUsingTwoPointer(input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}
