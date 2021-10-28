package com.wenqiu.leetCodeMaven;

public class RemoveElement {
	
	    public int removeElement(int[] nums, int val) {
	       if(nums==null|| nums.length==0){
	           return 0;
	       } 
	       int len=nums.length;
	       int j=len-1;
	       int occurTimes=0;
	        for(int i=0;i<=j;i++){
	           
	            if(nums[i]==val){
	                occurTimes++;
	                if(j==i) return len-occurTimes;
	                while(nums[j]==val){
	                    j--;
	                    occurTimes++;
	                    if(j==i) return len-occurTimes;
	                }
	                            
	                nums[i]=nums[j];  
	                j--;
	                
	            }
	            
	        }
	        return len-occurTimes;
	    }
	    public int removeElement2(int[]nums,int val) {
	    	String a="aaa";
	    	String[] result=a.split(" ");
	    	char[] scharArray=a.toCharArray();
	    	
	    	String b=result[result.length-1];
	    	int prePoint=0;
	    	int followPoint=0;
	    	while(prePoint<nums.length) {
	    		if(nums[followPoint]==val) {
	    			
	    			while(nums[prePoint]==val) {
	    				if(prePoint==nums.length-1)
	    					return followPoint;
	    				prePoint++;
	    			}
	    			int tmp=nums[followPoint];
	    			nums[followPoint]=nums[prePoint];
	    			nums[prePoint]=tmp;
	    			followPoint++;
	    			prePoint++;
	    			
	    		}else {
	    			prePoint++;
	    			followPoint++;
	    		}
	    	}
			return followPoint;
	    	
	    }
}
