package net.projecteuler.problem5;

import org.junit.Assert;
import org.junit.Test;

public class SmallestMultipleTest {

	@Test
	public void testGetSmallestMultiple() {
		SmallestMultiple multiple = new SmallestMultiple();
		
		Assert.assertEquals(0, multiple.getSmallestMultipleRange(-2, 1));
		Assert.assertEquals(6, multiple.getSmallestMultipleRange(3, 1));
		Assert.assertEquals(2, multiple.getSmallestMultipleRange(1, 2));
		Assert.assertEquals(6, multiple.getSmallestMultipleRange(1, 3));
		Assert.assertEquals(2520, multiple.getSmallestMultipleRange(1, 10));
		Assert.assertEquals(232792560, multiple.getSmallestMultipleRange(1, 20));
	}
}
