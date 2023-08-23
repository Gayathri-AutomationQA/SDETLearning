package tests;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MissingNumber {

	public int missingNumber(int[] nums) {

		//		 Problem : https://leetcode.com/problems/missing-number/
		//		 Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.


		// 1. Understood - Yes
		// 2.Frame Test data (valid, invalid and edge cases)
		// Input: nums = [3,0,1]
		// Output: 2

		//	Input: nums = [0,1]
		//	Output: 2
		// 3.Do you know the solution or else ask for hint? Yes
		// 4.Do you have any alternate approaches? find the best appraoch? No
		// 5.Write Pseudo code in paper
		/**
        	1. iterate through the array 0 to length
        	2. if the number is not present 
        	3. return num
		 */
		// 6.Dry run the pseudo code with prepared Test Data
		// 7.Write the code on paper
		// 8.Check for complie time errors
		// 9.write code on IDE - Done
		// 10.Debug the code if any failures
		// 11.Optimise the code
		
		//Approach 1
	int[] intArr = new int[10000];
		int out =0;
		for(int intSeq : nums){
			intArr[intSeq]++;
		}
		for(int i=0;i<nums.length+1;i++){
			if(intArr[i]==0){
				out = i;
			}
		}
		return out;
		
		
//		//Approach 2
//		 Arrays.sort(nums);
//			int out = 0;
//			boolean flag = false;
//			for (int i = 0; i < nums.length; i++) {
//				if(i!=nums[i]) {
//					out =i;
//					flag = true;
//					break;
//				}
//			}
//			if(flag==false) return nums[nums.length-1]+1;
//			return out;

		

	}
	@Test
	public void Test1() {	
		int actual = missingNumber(new int[] {1,2});
		System.out.println(actual);		
	}

}
