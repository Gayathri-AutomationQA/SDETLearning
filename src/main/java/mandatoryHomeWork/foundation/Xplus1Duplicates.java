package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class Xplus1Duplicates {
	public int xdups(int[] nums) {
		//		Given an integer array arr, count how many elements x there are, 
		//		   such that x + 1 is also in arr. 
		//		   If there are duplicates in arr, count them separately.
		//		   
		//		   example 1: input = [1, 2, 3]
		//					  output = 2
		//					explanation: when x is 1, we see x+1 (2) is present in input
		//								 when x is 2, we see x+1 (3) is present in input
		//								 when x is 3, we see x+1 (4) is not present in input
		//								so no of presence of x+1 is 2
		//		   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
		//					  output = 0
		//					  explanation: no occurence of x+1 for x
		//					  
		//		   example 3: input = [1, 1, 2]
		//					  output = 2
		//					  explanation: when x is 1, we see x+1 (2) is present in input
		//								   when x is 1, we see x+1 (2) is present in input
		//								   when x is 2, we see x+1 (3) is not present in input
		int counter=0;
		//{3, 1, 2,4,5,5,7,7}
		for (int i = 0; i < nums.length; i++) { 
			for (int j = 0; j < nums.length; j++) {
				if(i!=j) {
					if(nums[i]+1==nums[j]) {
						counter++;
						break;
					}
				}


			}

		}
		return counter;




	}

	@Test
	public void Test1() {	
		int actual = xdups(new int[] {1, 2, 3});
		Assert.assertEquals(2, actual);
	}
	@Test
	public void Test2() {	
		int actual = xdups(new int[] {1, 1, 3, 3, 5, 5, 7, 7});
		Assert.assertEquals(0, actual);
	}
	@Test
	public void Test3() {	
		int actual = xdups(new int[] {3, 1, 2,4,5,5,7,7});
		Assert.assertEquals(4, actual);
	}

	@Test
	public void Test4() {	
		int actual = xdups(new int[] {1, 3, 2, 3, 5, 0});
		Assert.assertEquals(3, actual);
	}
}
