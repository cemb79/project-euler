package net.projecteuler.problem0;

public class GreatCommonDivisor {

	public int generalizedGCD(int num, int[] arr) {
		
		if(num != arr.length) {
			return 0;
		}
		
		int res = arr[num - 1];
		for(int i = num - 1; i >= 0; i--) {
			if(i > 0)
				res = greatCommonDivisor(arr[i - 1], res);
		}
		
		return res;
		
	}

	public int greatCommonDivisor(int a, int b) {
		if(b < a) {
			int c = b;
			b = a;
			a = c;
		}
		
		int tmpa = a;
		int tmpb = b;
		int mod = 0;
		do {
			mod = tmpb % tmpa;
			tmpb = tmpa;
			tmpa = mod;
		} while(tmpa > 0);
		
		return tmpb;
	}
}
