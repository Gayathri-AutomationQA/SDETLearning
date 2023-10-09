package mandatoryHomeWork.algorithms.twoPointers;

import org.testng.annotations.Test;

public class CW_FindSmallestSumSubstring_TwoPointerGrowShrink {

//	public int smallestSumSubArray(int[] nums, int k) {
//		//1,2,3,4,5 k =10
//		int windowSize = 0;
//		while(windowSize < nums.length-1) {
//			int pointer = 0;
//			int sum =0;
//
//			while(pointer<windowSize) {
//				sum +=nums[pointer++]; //1 + 2 = 3
//				if(sum>k) {
//					return windowSize;
//				}
//			}
//			pointer = 1;
//			while(pointer < nums.length-windowSize+1) {
//				sum = sum - nums[pointer-1]+nums[pointer+windowSize-1];
//				if(sum>k) {
//					return windowSize;
//				}
//				pointer++;
//			}
//			windowSize++;
//		}
//
//		return 0;
//
//	}
	
	public int smallestSumSubArray(int[] nums,int k) {
		
		int left =0; int right =0; int sum =0; int windowSize =-1;
		
		while(right> nums.length-1){
			sum = sum + nums[left];
			if(sum<k) {
				left--;
			}
			
		}
		return windowSize;
		
	}

	@Test
	public void Test1() {	
		int actual = smallestSumSubArray(new int[] {1,2,3,4,5},13);
		System.out.println(actual);
	}

}
