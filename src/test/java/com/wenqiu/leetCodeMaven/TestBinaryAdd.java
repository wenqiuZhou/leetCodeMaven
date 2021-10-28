package com.wenqiu.leetCodeMaven;

import org.testng.annotations.Test;

public class TestBinaryAdd {
@Test
public void test() {
	BinaryAdd ba=new BinaryAdd();
	String a="101";
	String b="10101";
	ba.addBinary(a, b);
}
}
