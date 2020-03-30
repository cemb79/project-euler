package net.projecteuler.problem4;

import java.util.ArrayList;
import java.util.Collections;

public class LargestPalindromeProduct {

	public boolean isPalindrome(int number) {
		String numberStr = String.valueOf(number);
		StringBuilder left = new StringBuilder(numberStr.length());
		StringBuilder right = new StringBuilder(numberStr.length());
		for(int i = 0; i < numberStr.length(); i++) {
			left.append(numberStr.charAt(i));
		}
		for(int i = numberStr.length() - 1; i >= 0; i--) {
			right.append(numberStr.charAt(i));
		}
		
		return left.toString().equals(right.toString());
	}

	public int getLargestPalindromeProduct(int numDigits) {
		if(numDigits <= 1) {
			return 0;
		}
		int min = (int) (Math.pow(10, numDigits - 1));
		int max = (int) (Math.pow(10, numDigits) - 1);
		System.out.println(String.format("Range of number of %d digits is between %d - %d ", numDigits, min, max));
		ArrayList<Integer> palindromes = new ArrayList<>();
		for(int i = (int) (min * 0.90); i < max; i++) {
			for(int j = i + 1; j <= max; j++) {
				int product = i * j;
				if(isPalindrome(product)) {
					palindromes.add(product);
				}
			}
		}
		
		Integer maxPalindrome = Collections.max(palindromes);
		
		return maxPalindrome;
	}

}
