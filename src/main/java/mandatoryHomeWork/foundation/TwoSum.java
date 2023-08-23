package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {

	public int[] twoSum(int[] arr, int target) {
		int[] out = new int[] {-1,-1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					out[0]= i;
					out[1]= j;
					break;
				}
			}
		}
		return out;
	}

	//Positive
	@Test
	public void Test1() {
		int[] actual = twoSum(new int[] {3,2,3},6);
		Assert.assertEquals(0, actual[0]);
		Assert.assertEquals(2, actual[1]);
	}
	//Negative
	@Test
	public void Test2() {
		int[] actual = twoSum(new int[] {-3,-1,5},2);
		Assert.assertEquals(0, actual[0]);
		Assert.assertEquals(2, actual[1]);
	}
	//Edge
		@Test
		public void Test3() {
			int[] actual = twoSum(new int[] {1},1);
			Assert.assertEquals(-1, actual[0]);
			Assert.assertEquals(-1, actual[1]);
		}

}
