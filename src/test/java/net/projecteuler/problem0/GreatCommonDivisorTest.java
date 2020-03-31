package net.projecteuler.problem0;

import org.junit.Assert;
import org.junit.Test;

public class GreatCommonDivisorTest {
	
	GreatCommonDivisor gcd = new GreatCommonDivisor();

	@Test
	public void testGreatCommonDivisor() {
		
		int[] array = {2, 4, 6, 8, 10};
		Assert.assertEquals(2, gcd.generalizedGCD(5, array));
		int[] array2 = {24, 48, 60};
		Assert.assertEquals(12, gcd.generalizedGCD(3, array2));
		int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Assert.assertEquals(10, gcd.generalizedGCD(array3.length, array3));
	}
	
	@Test
	public void testGetGreatCommonDivisor() {
		Assert.assertEquals(12, gcd.greatCommonDivisor(48, 60));
		Assert.assertEquals(2, gcd.greatCommonDivisor(2, 10));
		Assert.assertEquals(3, gcd.greatCommonDivisor(9, 12));
	}
}
