package com.example.primefactorization.delegate;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
	
	public static List<Integer> getPrimeFactors(int number){
		
		List<Integer> factors = new ArrayList<Integer>();
		if (number <= 1) {
            factors.add(number);
            return factors;
        }

        while (number % 2 == 0) {
            factors.add(2);
            number = number / 2;
        }

        for (int i = 3; i * i <= number; i = i + 2) {
            while (number % i == 0) {
                factors.add(i);
                number = number / i;
            }
        }

        //prime number
        if (number > 1) {
            factors.add(number);
        }

        return factors;
    
		
	}

}
