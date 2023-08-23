package mandatoryHomeWork.foundation;

import org.junit.Test;

/*
 * Understood -- Yes
 * Input int[]
 * Output int[] - largest +1 
 */
public class HwPivotIndex {
	public int pivotIndex(int[] nums) {

		//[0,1,2,3,4,5]
		int sumTotal = 0;
		int sumLeft = 0;
		for (int i : nums) sumTotal+=i;
		for (int i = 0; i < nums.length; i++) {
			if (sumLeft==sumTotal-sumLeft-nums[i]) {
				return i;
			}
			sumLeft +=nums[i];
		}
		return -1;

	}

	@Test
	public void test1() {
		int actual = pivotIndex(new int[] {1,7,3,6,5,6});
		//		System.out.println(actual);
	}
}
