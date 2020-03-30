package net.projecteuler.problem4;

import org.junit.Assert;
import org.junit.Test;

public class LargestPalindromeProductTest {
	
	private LargestPalindromeProduct palindrome = new LargestPalindromeProduct();

	@Test
	public void testIsPalindromeNumber() {
		Assert.assertTrue(palindrome.isPalindrome(121));
		Assert.assertTrue(palindrome.isPalindrome(9009));
		Assert.assertFalse(palindrome.isPalindrome(9019));
	}	
	
	@Test
	public void testGetLargestPalindromeProduct() {
		Assert.assertEquals(0, palindrome.getLargestPalindromeProduct(1));
		Assert.assertEquals(9009, palindrome.getLargestPalindromeProduct(2));
		Assert.assertEquals(906609, palindrome.getLargestPalindromeProduct(3));
		Assert.assertEquals(99000099, palindrome.getLargestPalindromeProduct(4));
	}
}
