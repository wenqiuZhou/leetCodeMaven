package com.wenqiu.leetCodeMaven;

public class PlusOne {
	 public int[] plusOne(int[] digits) {
	        Boolean isAllNine=true;
	        for(int n:digits){
	            if(n!=9) isAllNine=false;
	        }
	        if(isAllNine){
	            int [] result=new int[digits.length+1];
	            result[0]=1;
	            return result;
	        }else{
	            int [] result=new int[digits.length];
	            Boolean needAdd=true;
	            for(int i=digits.length-1;i>=0;i--){
	                if(needAdd==true&&digits[i]==9){
	                    result[i]=0;
	            }else{
	                    if(needAdd){
	                   result[i]=digits[i]+1;
	                        needAdd=false;
	                    }
	                    else{
	                      result[i]=digits[i];  
	                    }
	                     
	                }
	        }
	            return result;
	    }
	        
	    }
	 public int[] plusOne2(int[] digits) {
		 int i=digits.length-1;
		 while(i>=0&&digits[i]==9) {
			 digits[i--]=0;
		 }
		 if(i<0) {
			 digits=new int[digits.length+1];
			 digits[0]=1;
			 return digits;
		 }
		 digits[i]=digits[i]+1;
		 return digits;
		 
	 }
}
