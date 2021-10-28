package com.wenqiu.leetCodeMaven;

public class MoveZeros {
	public void moveZeroes(int[] nums) {
		int numberOfZero = 0;
		for (int i = 0; i < nums.length;i++) {
			if (nums[i] == 0) {
				
				
				int j = i + numberOfZero;
				if(j==nums.length)
					return;
				while(nums[j]==0) {
					numberOfZero++;
					j++;//find the next number which is not zero
					if(j==nums.length)
						break;
				}
				nums[i]=nums[j];
				nums[j]=0;
				

			} 
			
		}
	}

}
