package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class Max69 {
	public  int maximum69Number (int num) {
		String str = Integer.toString(num);
		String out = "";
		int biggestNumber = num;
		char[] nums =  str.toCharArray();
        char[] numsCopy = Arrays.copyOf(nums, nums.length);

		// Creating object of String class
		String sb ="";

		for(int i=0;i<nums.length;i++){
			if(nums[i]=='6'){
				nums[i]= '9';
			}else{
				nums[i] = '6';
			}

			for (char c : nums) {
				sb = sb + c;
			}
			if(biggestNumber<Integer.parseInt(sb.trim())){
				biggestNumber = Integer.parseInt(sb.trim());
			}
		}
		return biggestNumber;

	}
}
