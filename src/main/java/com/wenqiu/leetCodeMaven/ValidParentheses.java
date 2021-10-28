package com.wenqiu.leetCodeMaven;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValidWithStack(String s) {

		int sLength = s.length();
		if (sLength == 0 || sLength % 2 != 0) {
			return false;
		}

		int index1 = 0;
		char firstChar = s.charAt(index1);
		if (firstChar == ')' || firstChar == ']' || firstChar == '}') {
			return false;
		}
		Map<Character, Character> opening = new HashMap<Character, Character>();
		opening.put('(', '1');
		opening.put('[', '2');
		opening.put('{', '3');
		Map<Character, Character> closing = new HashMap<Character, Character>();
		closing.put(')', '1');
		closing.put(']', '2');
		closing.put('}', '3');
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < sLength; i++) {
			char ch = s.charAt(i);
			if (opening.containsKey(ch)) {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				if (!opening.get(stack.pop()).equals(closing.get(ch))) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public boolean isValidStack(String s) {
		int len = s.length();
		if (len == 0 || len % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				if (isMatchParenthese(stack.peek(), ch)) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}

	private boolean isMatchParenthese(Character left, char right) {
		// TODO Auto-generated method stub
		if ((left == '(' && right == ')') || (left == '[' && right == ']') || (left == '{' && right == '}')) {
			return true;
		}
		return false;
	}

}
