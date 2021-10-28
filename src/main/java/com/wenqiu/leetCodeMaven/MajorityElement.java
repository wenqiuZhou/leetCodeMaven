package com.wenqiu.leetCodeMaven;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		int val;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (map.containsKey(i)) {
				val = map.get(i);
				val += 1;
				map.put(i, val);
			}
			else {
				map.put(i, 1);
			}

		}
		int max=0;
		int maxIndex=-1;
		for(int j :map.keySet()) {
			if(map.get(j)>max) {
				max=map.get(j);
				maxIndex=j;
			}
		}
		return maxIndex;
	}
}
