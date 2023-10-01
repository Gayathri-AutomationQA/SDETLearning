package mandatoryHomeWork.algorithms;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;


public class CW1_TwoSum_TwoPointer {
	
	public int[] twoSum(int[] nums, int k) {
		
		int left = 0 ; int right = left+1;
		int[] out = new int[2]; int sum =0;
		
//		 nums = [2,7,11,15], target = 9
		
		while(left<nums.length && right< nums.length) {
			
			sum += nums[left];
			if(sum == k) {
				out[0] = left;
				out[1] = right;
			}
			right++;
			if(right== nums.length-1) {
				left++;
			}
		}
		return out;
		
	}

	@Test
	public void test() {
		
		int hash = "SizeOfTheArray1".hashCode(); // Get the initial hash code of the key
		System.out.println(hash);
		int boxedValue = hash>>>16;
		int tableSize = 16; // Get the size of the array of buckets (usually a power of 2)
		int index = hash & (tableSize - 1); // Calculate the index using bitwise AND
		System.out.println(index);
		
		
		}

		
	

	// Now, 'index' is the bucket where the key-value pair should be stored


}
