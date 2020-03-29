package net.projecteuler.problem1;

import org.junit.Assert;
import org.junit.Test;

public class SummatoryPrimeMultiplesTest {

	@Test
	public void testGetSumMultiples_3_5() {
		int[] primes = {3, 5};
		SummatoryPrimeMultiples multiples = new SummatoryPrimeMultiples();
		
		Assert.assertEquals(0, multiples.getSumMultiples(primes, 0));
		Assert.assertEquals(0, multiples.getSumMultiples(primes, -1));
		Assert.assertEquals(0, multiples.getSumMultiples(primes, 1));
		Assert.assertEquals(23, multiples.getSumMultiples(primes, 10));
		Assert.assertEquals(45, multiples.getSumMultiples(primes, 15));
		Assert.assertEquals(225, multiples.getSumMultiples(primes, 31));
		Assert.assertEquals(1404932684, multiples.getSumMultiples(primes, 1000000));
	}
}
