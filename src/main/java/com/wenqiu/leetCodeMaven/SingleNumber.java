package com.wenqiu.leetCodeMaven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		List<Integer> numsList = new ArrayList<Integer>();
		for (int i=0;i<nums.length;i++) {
			numsList.add(nums[i]);

		}
		numsList.sort(null);
		int i=0;
		for (;i<nums.length-1;) {
			int a=numsList.get(i);
			System.out.println(a);
			int b=numsList.get(i+1);
			System.out.println(b);
			if(a==b)
				i+=2;
			else return a;
			
		}
		return numsList.get(i);
	}
	public int singleNumber_set(int[] nums) {
		Set<Integer> set=new HashSet<Integer>();
		for(int i:nums) {
			if(!set.contains(i))
				set.add(i);
			else set.remove(i);
			
		}
		return set.stream().findAny().orElse(0);
	}
	

}
