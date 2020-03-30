package net.projecteuler.problem6;

import org.junit.Assert;
import org.junit.Test;


public class SumSquareDifferenceTest {

	@Test
	public void testGetSumSquareDifference() {
		SumSquareDifference square = new SumSquareDifference();
		Assert.assertEquals(2640, square.getDifferenceSumSquares(1, 10));
		Assert.assertEquals(2640, square.getDifferenceSumSquares(1, 10));
		Assert.assertEquals(25164150, square.getDifferenceSumSquares(1, 100));
	}
}
