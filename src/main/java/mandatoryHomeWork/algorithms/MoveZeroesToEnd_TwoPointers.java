package mandatoryHomeWork.algorithms;

import org.testng.annotations.Test;

public class MoveZeroesToEnd_TwoPointers {

	
	//iterate through the array using i 
	//initiaise another pointer j =0
	//if the array[i] is non zero ,
		// replace array[j] = array[i]
		//increment j
	// iterate through j to length -1 and append zeroes at the end
	public int[] moveToEnds(int[] nums) {
		int j =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp = nums[i];
				nums[i]=  nums[j];
				nums[j] = temp;
				j++;
			}
		}
		
//		for (int i = nums.length-1; i >=j; i--) {
//			nums[i]=0;
//		}
		return nums;
	}
	
	@Test
	public void Test2() {	
		int[] actual = moveToEnds( new int[] {0,2,0,5,12});
		System.out.println(actual.toString());
		for (int i = 0; i < actual.length; i++) {
			System.out.println(actual[i]);
			
		}
//		System.out.println(actual[1]);
//		Assert.assertArrayEquals(actual, actual);
	}
	@Test
	public void Test1() {	
		int[] actual = moveToEnds( new int[] {0,0,0,0,10});
		System.out.println(actual.toString());
		for (int i = 0; i < actual.length; i++) {
			System.out.println(actual[i]);
			
		}
//		System.out.println(actual[1]);
//		Assert.assertArrayEquals(actual, actual);
	}
}
