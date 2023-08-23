package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElement {
	//	Remove the target element in the array
	//	
	//	example 1: input = [2, 3, 3, 4, 5], target=3
	//			   output = [2, 4, 5]
	//			   explanation: when 3 is removed from input array, 
	//							output is [2, 4, 5]
	//	
	//	example 2: input = [2, 2], target=2
	//			   output = []
	//			   explanation: when 2 is removed, output would be empty array/

	public int[] removeTargetElement(int[] nums,int target) {

		String outString = "";
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=target) {
				outString = outString + nums[i];
			}
		}
		int[] outArray = new int[outString.length()];

		for (int i = 0; i < outArray.length; i++) {
			outArray[i]= outString.charAt(i)-'0';
		}

		return outArray;
	}

	@Test
	public void Test1() {	
		int[] actual = removeTargetElement(new int[] {2, 3, 3, 4, 5}, 3);
		Assert.assertArrayEquals(new int[] {2,4,5}, actual);
	}
	@Test
	public void Test2() {	
		int[] actual = removeTargetElement(new int[] {2,2}, 2);
		Assert.assertArrayEquals(new int[] {}, actual);
	}
	@Test
	public void Test3() {	
		int[] actual = removeTargetElement(new int[] {1, 1, 2},1);
		Assert.assertArrayEquals(new int[] {2}, actual);
	}
}
