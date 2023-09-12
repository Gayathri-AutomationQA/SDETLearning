package mandatoryHomeWork.DailyHomeWork;

public class HW1816_TruncateSentence {
	public String truncateSentence(String s, int k) {
		//Approach 1
		String[] strOutput = s.split(" ");
		String strValue = "";
		if(s.length()==1){
			return s;
		}
		for(int i=0 ;i<k;i++){
			strValue=strValue+" "+ strOutput[i]; 
		}
		return strValue.trim();
	}


}
