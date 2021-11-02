package com.wenqiu.leetCodeMaven;

import org.testng.annotations.Test;

public class TestExcelSheetColumTitle {
@Test
public void test() {
	ExcelSheetColumnTitle esct=new ExcelSheetColumnTitle();
	String result=esct.convertToTitle(52);
	System.out.println(result);
}
}
