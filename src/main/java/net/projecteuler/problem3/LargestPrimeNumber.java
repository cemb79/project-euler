package net.projecteuler.problem3;

import java.util.ArrayList;

/**
 * 
 * @author Camilo Mercado
 *
 */
public class LargestPrimeNumber {

	public long getLargestPrimeNumber(long number) {
		long result = number;
		ArrayList<Long> primes = new ArrayList<>();
		if(number == 1 || number == 2) {
			result = number;
		} else {
			long i = number;
			long prime = 2;
			while(i > 1) {
				if(i % prime == 0) {
					i = i / prime;
					primes.add(prime);
					continue;
				} else {
					prime = getNextPrimeFactor(prime);
				}
			}
		}
		System.out.println(primes);
		result = primes.get(primes.size() - 1);
		return result;
	}

	private long getNextPrimeFactor(long prime) {
		do {
			prime++;
		} while(!isPrimeNumber(prime));
		return prime;
	}

	private boolean isPrimeNumber(long number) {
		boolean result = true;
		if(number == 1 || number == 2) {
			result = true;
		} else if(number % 2 == 0) {
			result = false;
		} else {
			for(long i = number; i > 1; i--) {
				if(i % number == 0) {
					continue;
				}
				if(i % 2 == 0) {
					continue;
				}
				if(number % i == 0) {
					result = false;
					break;
				}
			}
		}
		return result;
	}
	
	
}
