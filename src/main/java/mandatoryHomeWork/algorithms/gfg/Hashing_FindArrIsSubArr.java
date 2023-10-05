package mandatoryHomeWork.algorithms.gfg;

import java.util.HashMap;
import java.util.Map;

public class Hashing_FindArrIsSubArr {
	
	public boolean isArraySubArray(int[] arr1 , int[] arr2) {
		
//		Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
//		Output: arr2[] is a subset of arr1[]
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(Integer in : arr1) {
			map.put(in, 0);
		}
		
		for(Integer in : arr2) {
			if(!map.containsKey(in)) {
				return false;
			}
		}
		return true;
		
	}

}
