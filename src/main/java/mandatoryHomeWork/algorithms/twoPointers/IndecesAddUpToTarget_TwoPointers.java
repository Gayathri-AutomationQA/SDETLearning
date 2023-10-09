package mandatoryHomeWork.algorithms.twoPointers;

import org.junit.Assert;
import org.testng.annotations.Test;

public class IndecesAddUpToTarget_TwoPointers {
	
//	@Test
//	public void Test1() {	
//		int[] actual = addUpToTarget( new int[] {2,3,5,7}, 9);
//		System.out.println(actual[0]);
//		System.out.println(actual[1]);
//	}
	
	@Test
	public void Test2() {	
		int[] actual = addUpToTarget( new int[] {1,2,3,5,7}, 9);
		System.out.println(actual[0]);
		System.out.println(actual[1]);
		Assert.assertArrayEquals(actual, actual);
	}

	private int[] addUpToTarget(int[] input,int target ) {
		
		int left = 0;
		int right = input.length-1;
		int[] out = new int[] { -1, -1 };
		while(left<right) {
			int sum = input[left]+input[right];
			if(sum==target) {
				out[0] = left;
				out[1] = right;
				break;
			}else if(sum<target){
				left++;
			}else {
				right--;
			}
		}
		return out;
	}

}
