package net.projecteuler.problem3;

import org.junit.Assert;
import org.junit.Test;

public class LargestPrimeNumberTest {

	@Test
	public void testGetLargestPrimeNumber() {
		LargestPrimeNumber prime = new LargestPrimeNumber();
		Assert.assertEquals(3, prime.getLargestPrimeNumber(3));
		Assert.assertEquals(2, prime.getLargestPrimeNumber(4));
		Assert.assertEquals(5, prime.getLargestPrimeNumber(5));
		Assert.assertEquals(3, prime.getLargestPrimeNumber(6));
		Assert.assertEquals(3, prime.getLargestPrimeNumber(27));
		Assert.assertEquals(11, prime.getLargestPrimeNumber(110));
		Assert.assertEquals(29, prime.getLargestPrimeNumber(13195));
		Assert.assertEquals(6857, prime.getLargestPrimeNumber(600851475143L));
	}
}
