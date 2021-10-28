package com.wenqiu.leetCodeMaven;

import com.wenqiu.test.dataStructures.TreeNode;

public class DiameterOfBinaryTree {
	public int diameterOfBinaryTree(TreeNode root) {

		if (root == null) {
			return 0;
		}
		int left = getLongest(root.left);
		int right = getLongest(root.right);
		return left + right;
	}

	public int getLongest(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null)
			return 1;
		int left = getLongest(root.left);
		int right = getLongest(root.right);
		return Math.max(left, right);
	}
}
