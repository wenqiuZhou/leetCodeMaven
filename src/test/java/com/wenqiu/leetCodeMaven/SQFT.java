package com.wenqiu.leetCodeMaven;

public class SQFT {
	public int mySqrt(int x) {
		if (x == 0 || x == 1)
			return x;
		long low=1;
		long high=x;
		long result;
		while (high>low) {
			long mid=(low+high)/2;
			result=mid*mid;
			if (result== x) {
				return (int) mid;
			} else if(result<x){
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(high*high>x) {
			return (int) (high-1);
		}else {
			return (int) high;
		}
	}

}
