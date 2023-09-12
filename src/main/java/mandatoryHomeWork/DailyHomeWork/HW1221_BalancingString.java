package mandatoryHomeWork.DailyHomeWork;

public class HW1221_BalancingString {

	public int balancedStringSplit(String s) {

		int overAllCount =0;
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='L'){
				count++;
			}else{
				count--;
			}
			if(count==0){
				overAllCount++;
			}


		}
		return overAllCount;
	}
}
