package com.wenqiu.leetCodeMaven;

public class GuessNumberHigerOrLower {
	/*run out of time. so I should not use array*/
//    public int guessNumber_1(int n) {
//        int []array=new int[n];
// 	        for(int i=0;i<n;i++) {
// 	        	array[i]=i+1;
// 	        }
// 	        Boolean result=false;
// 	        
// 	        int start=0;
// 	        int end=n-1;
// 	        while (start<=end) {
// 	        	if(start==end)
// 	        		return array[start];
// 	        	int mid=start+(end-start)/2;
// 	        	int guessResult=guess(array[mid]);
// 	        	if(guessResult==0) {
// 	        		return array[mid];
// 	        	}else if(guessResult==-1){
// 	        		
// 	        		end=mid-1;
// 	        	}else {
// 	        		start=mid+1;
// 	        	}
// 	        	
// 	        }
// 	        return array[end];
//     }
//	public int guessNumber(int n) {
//
//	
//
//		int start = 1;
//		int end = n;
//		while (end > start) {
//			int mid = start + (end - start) / 2;
//			int result = guess(mid);
//			if (result == 0) {
//				return result;
//			}else if(result==-1){
//				end=mid-1;
//			}else {
//				start=mid+1;
//			}
//
//
//		}
//		return end;
//	}
}
