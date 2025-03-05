package com.example.primefactorization;

import com.example.primefactorization.delegate.PrimeFactorization;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrimeFactorizationAppApplicationTests {

	@Test
	void testPrimeFactorizationOfPrimeNumber() {
		assertEquals(List.of(7), PrimeFactorization.getPrimeFactors(7));
	}

	@Test
	void testPrimeFactorizationOfCompositeNumber() {
		assertEquals(List.of(2, 2, 3), PrimeFactorization.getPrimeFactors(12));
	}

	@Test
	void testPrimeFactorizationOfLargeNumber() {
		assertEquals(List.of(5, 5, 5, 5), PrimeFactorization.getPrimeFactors(625));
	}

	@Test
	void testPrimeFactorizationOfOne() {
		assertEquals(List.of(1), PrimeFactorization.getPrimeFactors(1));
	}

	@Test
	void testPrimeFactorizationOfNegativeNumber() {
		assertEquals(List.of(-15), PrimeFactorization.getPrimeFactors(-15));
	}

}
