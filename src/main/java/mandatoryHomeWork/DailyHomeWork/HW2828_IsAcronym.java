package mandatoryHomeWork.DailyHomeWork;

import java.awt.List;

public class HW2828_IsAcronym {
	public boolean isAcronym(List<String> words, String s) {

		String out="";
		for (String eachString : words) {
			out = out + eachString.charAt(0);
		}
		if(out.equals(s)) return true;

		return false;

	}
}
