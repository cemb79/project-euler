package net.projecteuler.problem5;

public class SmallestMultiple {

	public int getSmallestMultipleRange(int min, int max) {
		
		if(min < 0 || max < 0) {
			return 0;
		}
		
		if(max < min) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		int number = max;
		while(!isNumberDivisibleInRange(number, min, max)) {
			number++;
		}
		return number;
	}

	private boolean isNumberDivisibleInRange(int number, int min, int max) {
		boolean result = true;
		for(int i = min; i <= max; i++) {
			if(number % i != 0) {
				result = false;
				break;
			}
		}
		return result;
	}

}
