package com.wenqiu.leetCodeMaven;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author zhouwenqiu Two slow this way to get the minimum number.
 */

/*
 * public class MinStack { List<Integer> stack;
 * 
 * 
 * public MinStack() { stack=new ArrayList(); }
 * 
 * public void push(int val) { stack.add(val); }
 * 
 * public void pop() { stack.remove(stack.size()-1); }
 * 
 * public int top() { return stack.get(stack.size()-1);
 * 
 * }
 * 
 * public int getMin() { List<Integer> copyStack=new ArrayList<Integer>(stack);
 * copyStack.sort(null); return copyStack.get(0);
 * 
 * }
 * 
 * }
 */
public class MinStack {
	List<Integer> stack;

	private int min = Integer.MAX_VALUE;

	public MinStack() {
		stack = new ArrayList<Integer>();
	}

	public void push(int val) {
		stack.add(val);
		if (min > val)
			min = val;
	}

	public void pop() {

		if (stack.get(stack.size() - 1) == min) {
			min = Integer.MAX_VALUE;
			for (int i = 0; i < stack.size() - 1; i++) {
				if (stack.get(i) < min)
					min = stack.get(i);
			}
		}
		stack.remove(stack.size() - 1);

	}

	public int top() {
		return stack.get(stack.size() - 1);

	}

	public int getMin() {
		return min;

	}

}
