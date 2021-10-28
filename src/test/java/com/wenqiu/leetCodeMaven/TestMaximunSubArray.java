package com.wenqiu.leetCodeMaven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMaximunSubArray {
	@DataProvider(name = "dataArray")
	public Object[][] createData1() {
		int []a= {1,2,3,0,-1,-10,-9};
		int []b= {1,2,3,0,-1,5,-10,-9};
		int []c= {1,2,3,0,-1,5,-10,100};
		int []e= {5,4,-1,7,8};
		int []f= {0,-1};
		int []g= {0};
		int []h= {-1,-2,-3,-4,-5,0};
	 return new Object[][] {
	   { a, 6 },
	   { b, 10},
	   { c, 100},
	   {e,23},
	   {f,0,},
	   {g,0},
	   {h,0},
	 };
	}

	@Test(dataProvider = "dataArray")
	public void verifyMaxSubarray(int []array, int maxSum) {
	 assertEquals(MaximumSubarray.maxSubArray(array), maxSum);
	}

}
