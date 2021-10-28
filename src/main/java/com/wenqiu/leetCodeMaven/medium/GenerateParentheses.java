package com.wenqiu.leetCodeMaven.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
	public List<String> generateParenthesis_wrong(int n) {
		List<String> parentheses = new ArrayList<String>();
		if (n == 1) {
			parentheses.add("()");
		} else {
			Set<String> set=new HashSet<String>();
			List<String> previList = generateParenthesis(n - 1);
			for (String s : previList) {
				set.add("(" + s + ")");
				set.add(s + "()");
				set.add("()"+s);
			}
			parentheses.addAll(set);
		}
		return parentheses;
	}
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		dfs(result,n,n,"");
		return result;
		}
	private void dfs(List<String> result, int left, int right, String s)
	{
	    if(left > right)
	        return;
	    
	    if(left==0 && right==0)
	    {
	        result.add(s);
	        return;
	    }
	    if(left > 0)
	    {
	        dfs(result,left-1,right,s+"(");
	    }
	    
	    if(right > 0)
	    {
	        dfs(result,left,right-1,s+")");
	    }
	}
}
