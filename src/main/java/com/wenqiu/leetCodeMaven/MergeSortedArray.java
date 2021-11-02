package com.wenqiu.leetCodeMaven;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] result = new int[m + n];
		if (m == 0 & n == 0) {
			return;
		}
		int i = 0, j = 0, k = 0;
		while (i < m || j < n) {
			if (i < m && j < n) {
				if (nums1[i] <= nums2[j]) {
					result[k++] = nums1[i++];
					
				} else {
					result[k++] = nums2[j++];
					
				}
			} else if (i < m) {
				result[k++] = nums1[i++];
				
			}else{
				result[k++] = nums2[j++];
				
			}

		}
		for (int index = 0; index < m + n; index++) {
			nums1[index] = result[index];
		}
	}
}
