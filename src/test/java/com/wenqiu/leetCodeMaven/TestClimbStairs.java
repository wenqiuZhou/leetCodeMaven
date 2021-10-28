package com.wenqiu.leetCodeMaven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClimbStairs {
	@DataProvider(name = "data")
	public Object[][] createData1() {
	 return new Object[][] {
		 { 1, 1 },
		 { 45, 1836311903 },
	  
	   
	 };
	}
	@Test(dataProvider = "data")
	public void testClimbStairs(int stairs,int ways) {
		ClimbStairs cs = new ClimbStairs();
		assertEquals(cs.climbStairs_accept(stairs), ways);
	}

}
