package com.wenqiu.leetCodeMaven;

public class ClimbStairs {
	int[] dp = new int[46];

	public int climbStairs_accept(int n) {
		if (n < 3)
			return n;

		if (dp[n] != 0) {
			return dp[n];
		} else
			return dp[n] = climbStairs(n - 1) + climbStairs(n - 2);
	}

	public int climbStairs_recursive(int n) {
		if (n < 3)
			return n;

		else
			return climbStairs(n - 1) + climbStairs(n - 2);
	}

	public int climbStairs(int n) {
		
		int[] result = new int[n+1];
		if (n < 3)
			return n;
		result[0]=0;
		result[1]=1;
		result[2]=2;
		
		for(int i=3;i<n+1;i++) {
			
				result[i]=result[i-1]+result[i-2];
		}
		return result[n];
	}

	public int climbStairsFibonnacci(int n) {
		return (int) Math.round(
				(Math.pow((double) (1 + Math.sqrt(5)) / 2, n + 1) - Math.pow((double) (1 - Math.sqrt(5)) / 2, n + 1))
						/ (Math.sqrt(5)));
	}

}
