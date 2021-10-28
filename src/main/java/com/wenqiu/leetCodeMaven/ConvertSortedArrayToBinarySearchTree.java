package com.wenqiu.leetCodeMaven;

import java.util.Arrays;

import com.wenqiu.test.dataStructures.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
	  public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length==0)
	        	return null;
	        if(nums.length==1)
	        	return new TreeNode(nums[0]);
	        if(nums.length==2){
	        	TreeNode root=new TreeNode(nums[1]);
	        	root.left=new TreeNode(nums[0]);
	        	return root;
	        	
	        }
	        if(nums.length==3){
	        	TreeNode root=new TreeNode(nums[1]);
	        	root.left=new TreeNode(nums[0]);
	        	root.right=new TreeNode(nums[2]);
	        	return root;
	       }
	     
	        int middleIndex=nums.length/2;
	        TreeNode root=new TreeNode(nums[middleIndex]);
	        root.left=sortedArrayToBST(Arrays.copyOf(nums, middleIndex));
	        root.right=sortedArrayToBST(Arrays.copyOfRange(nums, middleIndex+1, nums.length));
	        return root;
	        		
	    }
}
