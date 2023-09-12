package mandatoryHomeWork.DailyHomeWork;

import java.util.Arrays;

public class HW645_SetMismatch {

	public int[] findErrorNums(int[] nums) {

		int[] out = new int[2];
		String strOut = "";
		Arrays.sort(nums);
		for (int i = 1; i <= nums.length; i++) {
			if(i!=nums[i-1]) {
				out[0]= nums[i-1];
				out[1]=i;
			}
		}
		return out;

	}

}
