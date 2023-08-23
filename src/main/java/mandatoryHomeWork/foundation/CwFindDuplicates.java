package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

//Problem: 
//https://leetcode.com/problems/contains-duplicate/description/

public class CwFindDuplicates {
	
	//	Given an integer array nums, return true if any value appears at least twice in the array, 
	//	and return false if every element is distinct.

	//Input - [1,2,2,2] any int[]
	//Output - Boolean 

	/*Positive - [1,2,3,2]
	Negative - [1,2,3]
	edge     - []*/

	/* Pseudo Code :
	 1. For loop to traverse through the array 
	 2. nested for loop to compare elements 
	 3. if condition to check if duplicate is there
	 4. Return output	 
	 */


	public boolean isDuplicateFound(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
			}
		}
		return false;

	}

	//Positive
	@Test
	public void Test1() {
		boolean actual = isDuplicateFound(new int[] {1,2,2,2,3,4,5});
		Assert.assertEquals(true, actual);
	}
	//Negative
	@Test
	public void Test2() {
		boolean actual = isDuplicateFound(new int[] {1,2,3});
		Assert.assertEquals(false, actual);
	}
	//Edge
	@Test
	public void Test3() {
		boolean actual = isDuplicateFound(new int[] {});
		Assert.assertEquals(false, actual);
	}

}
