package net.projecteuler.problem7;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TenThousandPrimeTest {
	
	TenThousandPrime prime = new TenThousandPrime();

	@Test
	public void testGetNthPrime() {
		Assert.assertEquals(13, prime.getNthPrime(6));
		Assert.assertEquals(17, prime.getNthPrime(7));
		//Assert.assertEquals(104743, prime.getNthPrime(10001));
	}
	
	@Test
	public void testGetListOfPrimes() {
		List<Integer> primes = prime.getListOfPrimes(1000);
		System.out.println(primes);
		System.out.println(primes.size());
	}
}
