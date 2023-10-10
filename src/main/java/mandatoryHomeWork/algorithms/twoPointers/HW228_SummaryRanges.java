package mandatoryHomeWork.algorithms.twoPointers;

import java.util.ArrayList;
import java.util.List;

public class HW228_SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		/*
		 *pseudo code
		 * Iterate through 0 to nums.length
		 * if i+1 != nums[i] 
		 *String = 
		 *
		 */

		List<String> lsOut = new ArrayList<>();

		if (nums == null || nums.length == 0) {
			return lsOut;
		}

		int left = nums[0];
		int right = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == right + 1) {
				right = nums[i];
			} else {
				if (left == right) {
					lsOut.add(Integer.toString(left));
				} else {
					lsOut.add(left + "->" + right);
				}
				left = right = nums[i];
			}
		}

		if (left == right) {
			lsOut.add(Integer.toString(left));
		} else {
			lsOut.add(left + "->" + right);
		}

		return lsOut;
	}



}
