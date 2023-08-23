package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;
//yet to complete
public class SingleNumber {
	public int singleNumber(int[] nums) {

		int single=0;
		int counter=0;
		
		for (int i = 0; i < nums.length; i++) {
			//			[2,2,1] [2,2,1]
			counter =0;
			for (int j = 0; j < nums.length; j++) {


				if(nums[i]==nums[j]) {
					counter++;
				}

			}
			if(counter==1) 
			single = nums[i];

		}
	
	return single;

}

//	//Positive
	@Test
	public void Test1() {
		int actual = singleNumber(new int[] {2,2,1});
		Assert.assertEquals(1, actual);
	}
//	Negative
	@Test
	public void Test2() {
		int actual = singleNumber(new int[] {4,1,2,1,2});
		Assert.assertEquals(4, actual);
	}

//Edge
@Test
public void Test3() {
	int actual = singleNumber(new int[] {1,1,2,7,2});
	Assert.assertEquals(7, actual);
}
}
