package mandatoryHomeWork;

public class SignOfTheProductOfAnArray {

	//	Input: nums = [-1,-2,-3,-4,3,2,1]
	//	Output: 1

	public int arraySign(int[] nums) {

		int count = 0;

		for (int i : nums) {
			if(i < 0) {
				count++;
			}else if (i == 0) {
				return 0;
			}
		}
		int result = (count%2 == 0)?  1 : -1;

		return result;
	}

}

