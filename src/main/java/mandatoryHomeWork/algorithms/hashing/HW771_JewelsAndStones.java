package mandatoryHomeWork.algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

public class HW771_JewelsAndStones {
	 public int numJewelsInStones(String jewels, String stones) {
	        //Add all stones to Map 
	        //check if jewel is there in the map 
	        
	        int JewelCounter =0;
	        Map<Character,Integer> stoneMap = new HashMap<>();
	        for(Character stone : stones.toCharArray()){
	             stoneMap.put(stone, stoneMap.getOrDefault(stone,0)+1);
	        }

	        for(Character jewel: jewels.toCharArray()){
	            if(stoneMap.get(jewel)!=null){
	                JewelCounter += stoneMap.get(jewel);
	            }
	        }

	        return JewelCounter;
	        
	    }

}
