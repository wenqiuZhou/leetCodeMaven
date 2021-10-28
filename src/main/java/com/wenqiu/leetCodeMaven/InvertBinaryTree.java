package com.wenqiu.leetCodeMaven;

import com.wenqiu.test.dataStructures.TreeNode;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		 if(root==null){
	          return root;
	      }
	       if(root.left==null&root.right==null)
		        	return root;
	         
		        TreeNode leftInverted=invertTree(root.left);
		        TreeNode righInverted=invertTree(root.right);
		        root.left=righInverted;
		        root.right=leftInverted;
	         
				return root;  
			
	    }
}
