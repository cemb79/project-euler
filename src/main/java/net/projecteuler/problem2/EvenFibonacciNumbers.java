package net.projecteuler.problem2;

import java.util.ArrayList;

/**
 * 
 * @author Camilo Mercado
 *
 */
public class EvenFibonacciNumbers {

	public int getSumEvenFibonacci(int number) {
		int sum = 0;
		if(number > 0) {
			ArrayList<Integer> evens = new ArrayList<>();
			int[] series = new int[number];
			for(int i = 1; i <= number; i++) {
				int index = i - 1;
				if(i == 1) {
					series[index] = i;
					evens.add(i);
					continue;
				}
				if(i == 2) {
					series[index] = i;
					continue;
				}
				int fib = series[index - 2] + series[index - 1];
				series[index] = fib;
				if(fib % 2 == 1) {
					evens.add(fib);
				}
			}
			
			sum = evens.stream().reduce(0, Integer::sum);
		}
		
		return sum;
	}

}
