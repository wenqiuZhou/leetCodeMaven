package com.wenqiu.leetCodeMaven;

import com.wenqiu.test.dataStructures.TreeNode;

public class PathSum {
	 public boolean hasPathSum(TreeNode root, int targetSum) {
	        if(null==root){
	            return false;
	        }
	        if(null==root.left&&null==root.right) {
	        	return(targetSum==root.val);
	        }
	        return(hasPathSum(root.left, targetSum-root.val)||hasPathSum(root.right, targetSum-root.val));
	        
	    }
}
