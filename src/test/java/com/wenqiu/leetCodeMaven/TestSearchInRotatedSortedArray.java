package com.wenqiu.leetCodeMaven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.wenqiu.leetCodeMaven.medium.SearchInRotatedSortedArray;

public class TestSearchInRotatedSortedArray {
	@Test
public void test(){
	SearchInRotatedSortedArray sr=new SearchInRotatedSortedArray();
	int[] nums= {4,5,6,7,0,1,2};
	int result=sr.search(nums, 0);
	assertEquals(4, result);
	
}
}
