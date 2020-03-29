package net.projecteuler.problem1;

import java.util.LinkedHashSet;

/**
 * 
 * @author Camilo Mercado
 *
 */
public class SummatoryPrimeMultiples {

	public int getSumMultiples(int[] primes, int number) {
		int sum = 0;
		if(number > 0) {
			LinkedHashSet<Integer> multiples = new LinkedHashSet<>(number);
			for(int i = 0; i < primes.length; i++) {
				int prime = primes[i];
				for(int j = prime; j < number; j++) {
					int mod = j % prime;
					if(mod == 0) {
						multiples.add(j);
					}
				}
			}
			
			sum = multiples.stream().reduce(0, Integer::sum);
		}
		return sum;
	}

}
