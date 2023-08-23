package mandatoryHomeWork.foundation;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {

		int i = 0;
		int zeroCounter = 0;
		for (int num : nums) {
			if(num!=0) {
				nums[i]=num;
				i++;
			}else{
				zeroCounter++;
			}
		}

		for (int j = nums.length-zeroCounter ;j< nums.length; j++) {
			nums[j] = 0;
		}
	}

}
