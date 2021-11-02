package com.wenqiu.leetCodeMaven;

import org.testng.annotations.Test;

public class TestMergeSortedArray {
@Test
public void test() {
	MergeSortedArray msa=new MergeSortedArray();
	int []a= {1,2,3,0,0,0};
	int[]b= {4,5,6};
	msa.merge(a, 3, b, 3);
}
}
