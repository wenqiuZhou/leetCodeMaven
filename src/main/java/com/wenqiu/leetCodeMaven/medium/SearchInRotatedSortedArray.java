package com.wenqiu.leetCodeMaven.medium;

public class SearchInRotatedSortedArray {
	 public int search(int[] nums, int target) {
	        int end=nums.length-1;
	        int start=0;
	       
	        while(end>=start) {
	        	 if(start==end) {
	 	        	if (nums[start]==target)
	 	        		return start;
	 	        	else {
	 					return -1;
	 				}
	 	        }
	        	int mid=start+(end-start)/2;
	        	if(nums[mid]==target)
	        		return mid;
	        	else if((target>nums[mid]&&target>nums[start])||(target<nums[mid]&&target<nums[start])) {
	        		start=mid+1;
	        	}else  {
	        		end=mid-1;
	        	}
	        }
	        return -1;
	    }
}
