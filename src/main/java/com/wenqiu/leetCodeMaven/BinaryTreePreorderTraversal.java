package com.wenqiu.leetCodeMaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.wenqiu.test.dataStructures.TreeNode;

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal_stack(TreeNode root) {
		List<Integer> result=new ArrayList<Integer>();
		if(root==null) {
			return result;
		}
		Stack<TreeNode> stack=new Stack<>();
		TreeNode current=root;
		while(current!=null||!stack.isEmpty()) {
			while(current!=null) {
				result.add(current.val);
				stack.push(current.right);
				current=current.left;
			}
			current=stack.pop();
		}
		return result;
	}
	

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		result.add(root.val);
		if (root.left != null) {
			result.addAll(preorderTraversal(root.left));

		}
		if (root.right != null) {
			result.addAll(preorderTraversal(root.right));
		}

		return result;
	}

}
