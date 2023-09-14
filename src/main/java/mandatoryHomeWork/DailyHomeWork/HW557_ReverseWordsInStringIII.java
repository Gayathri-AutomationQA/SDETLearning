package mandatoryHomeWork.DailyHomeWork;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HW557_ReverseWordsInStringIII {
	public String reverseWords(String s) {

//		Approach 1
		//String[] splitString = s.split(" ");
		//String outString  = "";

		//for(int i=0;i<splitString.length;i++){
		//outString = outString + " " +reverseString(splitString[i]);

		//}
		//return outString.trim();
		//}


		//public String reverseString(String originlaStr){

		//String revStr = "";
		//for(int j=originlaStr.length()-1;j>=0;j--){

		//  revStr += originlaStr.charAt(j);
		//}

		//return revStr;
		
		
//		Approach2

		return Arrays.stream(s.split(" "))
				.map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));

	}
}