package com.wenqiu.leetCodeMaven;

import com.wenqiu.test.dataStructures.TreeNode;

public class MaxDepthOfABinaryTree {


	public int maxDepth_recursive(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		int leftDepth = maxDepth_recursive(root.left);
		int rightDepth = maxDepth_recursive(root.right);
		return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;

	}

}
