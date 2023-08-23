package mandatoryHomeWork.foundation;

import org.junit.Test;

public class SquareOfSortedArray {
	public int[] sortedSquares(int[] nums) {
		int i=0;
		for (int num : nums) {
			nums[i]=num*num;
			i++;
		}
		int temp=0;
		for (int k = 0; k < nums.length; k++) {  
			for (int j = k + 1; j < nums.length; j++)  { 

				if(nums[k]>nums[j]) {
					temp = nums[k];
					nums[k]=nums[j];
					nums[j]= temp;
				}
			}
		}
		return nums;

	}


	@Test
	public void Test1() {	
		int[] chars = sortedSquares(new int[] {0,1,0,3,12});
	}

}
