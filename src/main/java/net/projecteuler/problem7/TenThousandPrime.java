package net.projecteuler.problem7;

import java.util.ArrayList;
import java.util.List;

public class TenThousandPrime {

	public int getNthPrime(int nthNumber) {
		
		long prime = 1;
		for(int i = 1; i <= nthNumber; i++) {
			prime = getNextPrime(prime);
		}
		return (int) prime;
		/*List<Integer> primes = getListOfPrimes(nthNumber * 3);
		if (primes.size() < nthNumber) {
			primes = getListOfPrimes(nthNumber * 10);
		}
		
		return primes.get(nthNumber - 1);*/
	}

	private long getNextPrime(long prime) {
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
	
	/*
	 * Sieve of Eratosthenes algorithm
	 */
	public List<Integer> getListOfPrimes(int max) {
		Integer[] numbers = new Integer[max + 2];
		for(int i = 2; i <= max; i++) {
			numbers[i - 2] = i;
		}
		
		int i = 0;
		while(i < numbers.length) {
			Integer factor = numbers[i];
			if(factor == null) {
				i++;
				continue;
			}
			int j = factor;
			while(j < numbers.length) {
				int num = j * factor;
				if(num > numbers.length) {
					break;
				}
				numbers[num - 2] = null;
				j++;
			}
			i++;
		}
		
		ArrayList<Integer> primes = new ArrayList<>();
		for(Integer ind : numbers) {
			if(ind != null) {
				primes.add(ind);
			}
		}
		return primes; 
	}
}
