package mandatoryHomeWork.DailyHomeWork;

public class HW2645_AddMinimum {

	public int addMinimum(String word) {

		String word1 = word.replaceAll("abc","0").replaceAll("ab","1").replaceAll("bc","1").replaceAll("ac","1").replaceAll("a","2").replaceAll("b","2").replaceAll("c","2");
		int out =0;
		for(int i =0;i<word1.length();i++){
			out += word1.charAt(i)-'0';
		}

		return out;  
	}
}
