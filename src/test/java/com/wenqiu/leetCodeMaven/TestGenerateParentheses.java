package com.wenqiu.leetCodeMaven;

import java.util.List;

import org.testng.annotations.Test;

import com.wenqiu.leetCodeMaven.medium.GenerateParentheses;

public class TestGenerateParentheses {
@Test
public void test() {
	GenerateParentheses gp=new GenerateParentheses();
	List<String> result=gp.generateParenthesis(2);
	System.out.println(result);
}
}
