package net.projecteuler.problem2;

import org.junit.Assert;
import org.junit.Test;

public class EvenFibonacciNumbersTest {

	@Test
	public void testSumEvenFibonacci() {
		EvenFibonacciNumbers even = new EvenFibonacciNumbers();
		Assert.assertEquals(0, even.getSumEvenFibonacci(0));
		Assert.assertEquals(1, even.getSumEvenFibonacci(1));
		Assert.assertEquals(1, even.getSumEvenFibonacci(2));
		Assert.assertEquals(4, even.getSumEvenFibonacci(3));
		Assert.assertEquals(9, even.getSumEvenFibonacci(4));
		Assert.assertEquals(9, even.getSumEvenFibonacci(5));
		Assert.assertEquals(22, even.getSumEvenFibonacci(6));
		Assert.assertEquals(187, even.getSumEvenFibonacci(10));
		Assert.assertEquals(1619982070, even.getSumEvenFibonacci(4000000));
	}
}
