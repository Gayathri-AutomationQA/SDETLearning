package tests;

import org.testng.annotations.Test;

public class SetMismatch {

	public int[] findErrorNums(int[] nums) {
		int[] out = new int[2];
		int j ,k;
		for (int i = 0; i < nums.length; i++) {
			j=nums[i];
			k=j+1;
			if(j==k) {
//				System.out.println(i);
//				System.out.println(nums[i]);
				out[0]= j;
				out[1]=k;
			}
		}


		return out;

	}
	@Test
	public void Test1() {	
		int[] actual = findErrorNums(new int[] {1,1});
		for (int i = 0; i < actual.length; i++) {
			System.out.println(actual[i]);
		}
		
	}
}
