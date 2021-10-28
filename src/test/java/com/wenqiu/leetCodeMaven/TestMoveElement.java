package com.wenqiu.leetCodeMaven;

import org.testng.annotations.Test;

public class TestMoveElement {
@Test
public void test() {
	int[]array= {3,1,2,3,3,3,3,3};
	RemoveElement re=new RemoveElement();
	re.removeElement(array, 3);
	
}
}
