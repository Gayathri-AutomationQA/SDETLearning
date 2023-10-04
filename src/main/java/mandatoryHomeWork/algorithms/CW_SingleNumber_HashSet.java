package mandatoryHomeWork.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class CW_SingleNumber_HashSet {
	
	public int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		// 2 2 1
		int index = 0;
		//4,1,2,1,2
		for (int i : nums) {
//			if(!set.add(i)) 
//				set.remove(i);
			if(set.contains(i)) {
				set.remove(i);
			}else {
				set.add(i);
			}
			
		}
		
		List<Integer> arrayList = new ArrayList<>();
		
		arrayList.contains(arrayList);
		
		return (int) set.toArray()[0];
//		return set.iterator().next();
	}


	@Test
	public void Test() {
	int act = singleNumber(new int[]{2,2,1});
		System.out.println(act);
	}

}
