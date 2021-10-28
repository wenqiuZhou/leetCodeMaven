package com.wenqiu.leetCodeMaven;

import java.util.Stack;

import com.wenqiu.test.dataStructures.TreeNode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		  if (root.left == null && root.right == null) {
				return true;
			}
			if (root.left == null || root.right == null)
				return false;
			Stack<TreeNode> nodes = new Stack<TreeNode>();
			nodes.push(root.left);
			nodes.push(root.right);
			TreeNode t1, t2;
			while (!nodes.isEmpty()) {
				t2 = nodes.pop();//get right
				t1 = nodes.pop();//get left
				if (t1 == null & t2 == null)
					continue;
				if(t1==null|| t2==null|| t1.val!=t2.val)
					return false;
				nodes.push(t1.left);
				nodes.push(t2.right);
				nodes.push(t1.right);
				nodes.push(t2.left);
				
			}
			return true;
	}

	public boolean isSymmetric_recursive(TreeNode root) {
		if (root != null) {
			if (root.left == null && root.right == null) {
				return true;
			}
			if (root.left == null || root.right == null)
				return false;

			else {
				return compare(root.left, root.right);

			}

		}
		return false;

	}

	private Boolean compare(TreeNode r1, TreeNode r2) {
		if (r1 == null && r2 == null)
			return true;
		if (r1 == null || r2 == null || r2.val != r1.val) {
			return false;
		} else {
			return compare(r1.left, r2.right) && compare(r1.right, r2.left);
		}

	}

}
