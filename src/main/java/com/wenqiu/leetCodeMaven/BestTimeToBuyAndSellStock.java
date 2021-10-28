package com.wenqiu.leetCodeMaven;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		int maxValue = 0;
		int startId=0;
		for (int i = 0; i < prices.length; i++) {
			
			if(prices[i]<prices[startId]) {
				startId=i;
			}else {
				int benifit=prices[i]-prices[startId];
				maxValue=maxValue>benifit?maxValue:benifit;			
			}
		}
		return maxValue;
	}
}
