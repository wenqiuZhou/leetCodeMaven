package com.wenqiu.leetCodeMaven;

import com.wenqiu.test.dataStructures.TreeNode;

public class MinimumDepthOfBinaryTree {
	 public int minDepth(TreeNode root) {
	        if(null==root) {
	        	return 0;
	        }
	        //Make sure it is leaf
	        else if(root.left == null)
	            return 1+ minDepth(root.right);
	        else if(root.right == null)
	            return 1+ minDepth(root.left);
	        int minLeft=minDepth(root.left);
	        int minRight=minDepth(root.right);
	        return(Math.min(minLeft, minRight)+1);
	        
	    }
	 
	 
}
