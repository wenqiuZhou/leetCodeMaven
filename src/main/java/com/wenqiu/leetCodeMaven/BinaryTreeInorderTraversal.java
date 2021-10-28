package com.wenqiu.leetCodeMaven;

import java.util.ArrayList;
import java.util.List;

import com.wenqiu.test.dataStructures.TreeNode;

public class BinaryTreeInorderTraversal {
	List<Integer> result = new ArrayList<Integer>();

	public List<Integer> inorderTraversal(TreeNode root) {

		if (root != null) {

			inorderTraversal(root.left);

			result.add(root.val);

			inorderTraversal(root.right);
		}
		return result;
	}
	  public List<Integer> inorderTraversal_localVariable(TreeNode root) {
	        List<Integer> result = new ArrayList<Integer>();
			if (root == null) {
				return result;
			}
			
			if (root.left != null) {
				result.addAll(inorderTraversal(root.left));
			}
	        	result.add(root.val);
			if (root.right != null) {
				result.addAll(inorderTraversal(root.right));
			}
			return result;
	    }
}
