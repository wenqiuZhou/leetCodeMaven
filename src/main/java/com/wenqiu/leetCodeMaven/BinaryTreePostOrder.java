package com.wenqiu.leetCodeMaven;

import java.util.ArrayList;
import java.util.List;

import com.wenqiu.test.dataStructures.TreeNode;

public class BinaryTreePostOrder {
	 public List<Integer> postorderTraversal(TreeNode root) {
	        List<Integer> result=new ArrayList<>();
	        if(root==null) {
	        	return result;
	        }
	        if(root.left!=null) {
	        	result.addAll(postorderTraversal(root.left));
	        }
	        if(root.right!=null) {
	        	result.addAll(postorderTraversal(root.right));
	        }
	        result.add(root.val);

	        int[]a =new int[10];
	        
	        return result;
	    }
}
