package com.wenqiu.leetCodeMaven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestSingleNumber {
@Test
public void test1() {
	SingleNumber sn=new SingleNumber();
	int [] nums= {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};
	int result=sn.singleNumber(nums);
	assertEquals(result,354);
}
}