package mandatoryHomeWork.algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HW219_ContainsDuplicate {

	//	Create a map 		
	//	check if the map contains key if true 		
	//	TRUE	find the index - containsValue 	
	//	FALSE	keep adding index and value 	

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i],i);
			}else {
				if(Math.abs(map.get(nums[i])-i)<= k) {
					return true;
				}else{
			          map.put(nums[i],i);
				}
			}

		}
		return false;



	}
	
	@Test
	public void test1() {
		Boolean actual = containsNearbyDuplicate(new int[] {1,0,1,1},  1);
		Assert.assertTrue(actual);
	}

}
