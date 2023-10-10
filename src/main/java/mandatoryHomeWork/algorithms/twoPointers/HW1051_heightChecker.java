package mandatoryHomeWork.algorithms.twoPointers;

import java.util.Arrays;

public class HW1051_heightChecker {
	public int heightChecker(int[] heights) {

		int[] heightsSorted = Arrays.copyOf(heights,heights.length);
		Arrays.sort(heights);
		int count =0 ;
		for(int i =0;i<heights.length;i++){
			if(heights[i]!=heightsSorted[i]){
				count++;
			}
		}
		return count;
	}
}
