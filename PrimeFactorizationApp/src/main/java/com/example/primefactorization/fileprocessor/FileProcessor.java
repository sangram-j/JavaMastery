package com.example.primefactorization.fileprocessor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.example.primefactorization.delegate.PrimeFactorization;

public class FileProcessor {

	public static void processFile(String filePath) throws Exception {

		FileReader fileReader = new FileReader(filePath);

		try (BufferedReader reader = new BufferedReader(fileReader)) {
			String line;
			
			if (reader.readLine() == null) {
				System.err.println("Error: File does not exist - " + filePath);
				return;
			}
			while ((line = reader.readLine()) != null) {
				try {
					int number = Integer.parseInt(line.trim());
					List<Integer> factors = PrimeFactorization.getPrimeFactors(number);
					System.out.println(number + " -> "
							+ String.join(",", factors.stream().map(String::valueOf).toArray(String[]::new)));

				} catch (NumberFormatException e) {
					System.err.println("Skipping invalid line : " + line);
				}
			}

		} catch (IOException e) {
			System.err.println("Error during reading file : " + e.getMessage());
		}
	}

}
