package com.basic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {

	public static void main(String[] args) {

		String s = "big black bug bit a big bladf dog on his big nose";

		int count;

		s.toLowerCase();
		String arr[] = s.split(" ");

		System.out.println("Duplicate words are >>");

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					count++;
					arr[j] = "0";
				}

			}
			if(count > 1 && arr[i] != "0") {
				System.out.println(arr[i] + " "+ count);
			}
		}

		//using java8
		String[] arr1 = s.split(" ");
		List<String> duplicateString = Arrays.stream(arr1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(st -> st.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("duplicateString -> "+duplicateString);

		//unique elements
		String[] arr2 = s.split(" ");
		List<String> uniqueString = Arrays.stream(arr2).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(st -> st.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("uniqueString -> "+uniqueString);

		//first non-repeating element
		String[] arr3 = s.split(" ");
		String nonRepeatElement = Arrays.stream(arr3).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(st -> st.getValue() == 1)
				.findFirst().get().getKey();

		System.out.println("first non repeating String -> "+nonRepeatElement);

		//find the longest string from array / string
		String[] arr4 = s.split(" ");
		String largestSTring = Arrays.stream(arr4).reduce((obj1,obj2)->obj1.length() > obj2.length() ? obj1 : obj2)
				.get();
		System.out.println("Largest string in array :- "+largestSTring);

		//duplicate string with count
		Map<String, Long> duplicateStrCount = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("duplicateString count -> "+duplicateStrCount);


		//find element which starts with 1
		int [] intArray = {5,1,3,51,14,61,8,9,11,21};
		List<String> el = Arrays.stream(intArray)
				.boxed()
				.map(ch->ch +"")
				.filter(ch -> ch.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("element which starts with 1 :- "+el);

	}
	public static void findDuplicateCharacters(String inputString) {
		// Convert the input string to lowercase
		inputString = inputString.toLowerCase();

		// Array to store the count of each character (assuming ASCII characters)
		int[] charCount = new int[256];

		// Iterate through each character in the input string
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			// Ignore spaces
			if (c != ' ') {
				// Increment the count of the corresponding character in the array
				charCount[c]++;
			}
		}

		// Printing duplicate characters along with their counts
		System.out.println("Duplicate characters in the string '" + inputString + "':");
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 1) {
				System.out.println("'" + (char) i + "' : " + charCount[i] + " times");
			}
		}
	}
}
