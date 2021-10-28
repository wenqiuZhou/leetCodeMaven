package com.wenqiu.leetCodeMaven;

public class CountingBits {
	public int[] countBits(int n) {
		int[] nums = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			int num = i;
			int ones = 0;
			while (num != 0) {
				if ((num & 1) == 1) {
					ones++;
					num >>= 1;
				} else {
					num >>= 1;
				}

			}
			nums[i] = ones;
		}
		return nums;
	}
}
