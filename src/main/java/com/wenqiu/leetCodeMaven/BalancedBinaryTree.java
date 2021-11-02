package com.wenqiu.leetCodeMaven;

import com.wenqiu.test.dataStructures.TreeNode;

public class BalancedBinaryTree {
	boolean isBalanced=true;
	 public boolean isBalanced(TreeNode root) {
	        if(null==root) {
	        	return isBalanced;
	        }
	       int left=getTreeLength(root.left);
	       int right=getTreeLength(root.right);
	       if(Math.abs(left-right)>1) {
				 isBalanced=false;
			 }
	       return isBalanced;
	    }
	 
	 private int getTreeLength(TreeNode root) {
		 if(null==root) {
			 return 0;
		 }
		 int left=getTreeLength(root.left);
		 int right=getTreeLength(root.right);
		 if(Math.abs(left-right)>1) {
			 isBalanced=false;
		 }
		 return(Math.max(left, right)+1);
	 }
}
