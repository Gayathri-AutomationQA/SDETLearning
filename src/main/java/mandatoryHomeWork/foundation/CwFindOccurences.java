package mandatoryHomeWork.foundation;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class CwFindOccurences {
	
	//Get input array and variable x
	// Output  : Number of occurence

	// 1. For loop 
	// 2. Compare the array [i] to x , if condition 
	// 3. Counter j  ++ if found else proceed
	// 4. return the counter after the for loop
	
	
	
	public int noOfOccurences (int[] nums ,int a) {
		int counter =0;
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
			if(nums[i] == a) {
				counter++;
			}
		}
		return counter;
		
	}
	
	@Test
	public void Test1() {
		int actual = noOfOccurences(new int[] {1,2,22222,2,3,4,5},2);
		Assert.assertEquals(2, actual);
	}

}
