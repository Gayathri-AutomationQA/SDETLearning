package mandatoryHomeWork.algorithms;

public class HW2697_MakeSmallestPalindrome {

	//Technique : Two Pointer
	//Time Complexity : O[N]
	//Space Complexity : O[1]


	public String makeSmallestPalindrome(String s) {
		char[] output = s.toCharArray();
		int left =0, right = output.length-1;

		while(left<right){
			if(output[right]<output[left]){
				output[left] = output[right];
			}
			if(output[left]<output[right]){
				output[right] = output[left];
			}
			left++;
			right--;
		}
		return new String(output);
	}

}
