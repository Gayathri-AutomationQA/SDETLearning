package mandatoryHomeWork.algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

public class HW1748_SumOfUniqueElements {
	
	//Time: O[N] , Space : O[N]

	public int sumOfUnique(int[] nums) {

		Map<Integer,Integer> map = new HashMap<>();
		int sum =0;
		for(Integer eachNum : nums){
			if(map.containsKey(eachNum)){
				map.put(eachNum, map.getOrDefault(eachNum,0)+1);
			}else{
				map.put(eachNum,1);
			}
		}   

		for(Map.Entry<Integer,Integer> each : map.entrySet()){
			if(each.getValue() ==  1){
				sum += each.getKey();
			}
		}
		return sum;
	}

}
