package mandatoryHomeWork.algorithms.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW888_FairCandy {
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

		// input: aSize = [1,1] bSize = [2,2]
		// Input: aliceSizes = [1,2], bobSizes = [2,3]		
		Set<Integer> aliceSet = new HashSet<>();
		Set<Integer> bobSet = new HashSet<>();

		int aliceTotalCandies = 0;
		int bobTotalCandies = 0;
		
		for (int aliceCandies = 0; aliceCandies < aliceSizes.length; aliceCandies++) {
			aliceTotalCandies += aliceSizes[aliceCandies];
			aliceSet.add(aliceSizes[aliceCandies]);
		}
		
		for (int bobCandies = 0; bobCandies < bobSizes.length; bobCandies++) {
			bobTotalCandies += bobSizes[bobCandies];
			bobSet.add(bobSizes[bobCandies]);
		}
		
		int candyDifference = ~(bobTotalCandies-aliceTotalCandies);
		 for (int aliceSize : aliceSet) {
			
			int neededRemaining = candyDifference+ aliceSize;
			
			if(bobSet.contains(neededRemaining)) {
				return new int[] {neededRemaining,aliceSize};
			}
		}

		return new int[] {};

	}

}
