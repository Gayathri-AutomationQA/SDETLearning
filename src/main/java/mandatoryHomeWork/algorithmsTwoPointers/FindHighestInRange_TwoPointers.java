package mandatoryHomeWork.algorithmsTwoPointers;

import org.testng.annotations.Test;

public class FindHighestInRange_TwoPointers {
	
	@Test
	public void Test2() {	
		int actual = slidingWindow( new int[] {1}, 1);
		System.out.println(actual);
	}
	
//	private int slidingWindow(int[] numsArr,int target) {
//		int count =1;
//		int sum =0;
//		int maxSum = Integer.MIN_VALUE;
//		for(int i =0;i<numsArr.length;i++) {
//			sum += numsArr[i];
//			if(count == target) {
//				if(sum>maxSum) {
//					maxSum = sum;
//				}
//				sum =0;
//				count=0;
//				i =i+1;
//			}
//			count++;
//		}
//		
//		return maxSum;
//	}
	
	
	 private int slidingWindow(int[] nums, int k){
		 String check ;
//	        //1. one pointer should work
	        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
//	        // not needed second pointer as this is balanced traversal ,right = k-1;
//	        //2. Do the required operation till k index
	        while(pointer < k)
	            currentSum += nums[pointer++];
//	        //3. continue the operation for rest of the array
	        while( pointer < nums.length){
	            max = Math.max(currentSum, max);
	            currentSum += nums[pointer] - nums[pointer-k];
	            pointer++;
	        }
	        return Math.max(currentSum, max);
	    }
	 
//	 currentSum += nums[pointer];
//	 currentSum-= nums[pointer++-k];
//
//	 to ease out the understanding of the sliding window pointer movement use the above code instead of
//
//	 currentSum += nums[pointer] - nums[pointer++-k];

}
