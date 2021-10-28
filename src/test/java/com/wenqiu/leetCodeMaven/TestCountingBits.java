package com.wenqiu.leetCodeMaven;

import org.testng.annotations.Test;

public class TestCountingBits {
	@Test
	public void test() {
	CountingBits cb=new CountingBits();
	int nums[]=cb.countBits(2);
	int[] result= {0,1,1};
	nums.equals(result);
	}

}
