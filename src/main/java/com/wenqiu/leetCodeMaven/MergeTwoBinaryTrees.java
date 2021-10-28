package com.wenqiu.leetCodeMaven;

import com.wenqiu.test.dataStructures.TreeNode;

public class MergeTwoBinaryTrees {
	int max = 0;
//	  public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//	        if(root1==null) {
//	        	return root2;
//	        }
//	        if(root2==null) {
//	        	return root1;
//	        }
//	        root1.val=root1.val+root2.val;
//	        root1.left=mergeTrees(root1.left, root2.left);
//	        root2.right=mergeTrees(root1.right, root2.right);
//	        return root1;
//	    }

	public int diameterOfBinaryTree(TreeNode root) {

		if (root == null) {
			return 0;
		}
		int left = getLongest(root.left);
		int right = getLongest(root.right);
		return Math.max(max, left + right);
	}

	public int getLongest(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null)
			return 1;
		int left = getLongest(root.left);
		int right = getLongest(root.right);
		max = Math.max(max, left + right);
		return Math.max(left + 1, right + 1);
	}
}
