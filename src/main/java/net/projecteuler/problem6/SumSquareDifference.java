package net.projecteuler.problem6;

public class SumSquareDifference {

	public int getDifferenceSumSquares(int min, int max) {
		
		if(min < 0 || max < 0) {
			return 0;
		}
		
		if(max < min) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		int sumOfSquares = 0;
		for(int i = min; i <= max; i++) {
			int pow = (int) Math.pow(i, 2);
			sumOfSquares += pow;
		}
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		int sqSum = (int) Math.pow(sum, 2);
		return sqSum - sumOfSquares;
	}

}
