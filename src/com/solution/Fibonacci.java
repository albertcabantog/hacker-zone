package com.solution;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println("result: " + f.compute(1,  8));
	}

	private int compute(int start, int end) {
		int result = 0;
		int a = 0;
		int b = 1;
		
		for (int i = start ; i <= end ; i++) {
			
			if (i > 2) {
				a = b;
				b = result;
			}
			result = computeSum(a, b, i);
			System.out.println("f[" + i + "] = " + result);
		}
		return result;
	}
	
	private int computeSum (int prev1, int prev2, int ctr) {
//		if (ctr == 0) return prev1;
//		if (ctr == 1) return prev2;
		if (ctr <= 1) return ctr;
		int sum = prev1 + prev2;
		return sum;
	}
}
