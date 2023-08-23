package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class HwMajorityElement {

	/* Problem Statement :
	 Given an array nums of size n, return the majority element.
     The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
	 */

	/* 
		  Input - int[]  
		  Output - int
	 */ 

	/*Positive - [3,2,3]
		  Negative -[2,2,1,1,1,2,2] --> [1,1,1,2,2,2,2]
		  Edge     - []
	 */


	/*psuedo Code:
	 */

	public int majorityElement (int[] nums) {
		Arrays.sort(nums);
		 int count = 1;
    	 int maxCount =0;
		 int n = nums.length;
         for (int j = 0; j < n ; j++) {
        	 count=1;
        	 for (int i = j+1; i < nums.length; i++) {
        		 if (nums[j] == nums[i])
                     count++;
			}
			if(count> n/2) {
        		 maxCount = nums[j];
             	return maxCount;
			}
             	
         }
         return 0;
       
	}

	//Positive
	@Test
	public void Test1() {
		int actual = majorityElement(new int[] {3,2,3});
		System.out.println(actual);
		Assert.assertEquals(3, actual);
	}
	//Negative
	@Test
	public void Test2() {
		int actual = majorityElement(new int[] {2,2,1,1,1,2,2});
		System.out.println(actual);
		Assert.assertEquals(2, actual);
	}

	//Edge
	@Test
	public void Test3() {
		int actual = majorityElement(new int[] {1,1});
		Assert.assertEquals(1, actual);
	}

}
