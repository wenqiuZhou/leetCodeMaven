import java.lang.module.ResolutionException;
import java.util.Arrays;

public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		int len = numbers.length;
		int[] result = new int[2];
		for (int i = 0; i < len; i++) {
			if (numbers[i] >= target) {
				break;
			}
			int second=Arrays.binarySearch(numbers, i+1, len, target-numbers[i]);
			if(second>=0) {
				result[0]=i+1;
				result[1]=second+1;
				break;
			}
			
		}
		return result;
	}
	public int[] twoSum_2(int[] numbers, int target) {
		int start=0;
		int end=numbers.length-1;
		int[]result=new int[2];
		int sum;
		while(start<end) {
			sum=numbers[start]+numbers[end];
			if(sum==target) {
				result[0]=start+1;
				result[1]=end+1;
				break;
			}
			if(sum>target) {
				end--;
			}else {
				start++;
			}
		}
		return result;
	}
}
