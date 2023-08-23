package mandatoryHomeWork.foundation;

public class HwMissingnumbers {
	public int missingNumber(int[] nums) {
		int[] intArr = new int[10000];
		int out =0;
		for(int intSeq : nums){
			intArr[intSeq]++;
		}
		for(int i=0;i<nums.length+1;i++){
			if(intArr[i]==0){
				out = i;
			}
		}
		return out;
	}
}
