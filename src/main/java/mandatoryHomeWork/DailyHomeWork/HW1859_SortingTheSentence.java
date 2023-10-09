package mandatoryHomeWork.DailyHomeWork;

public class HW1859_SortingTheSentence {

	public String sortSentence(String s) {
		String[] sArr = s.split(" ");
		String[] out = new String[sArr.length];
		for(int i =0;i<sArr.length;i++){
			out[Integer.parseInt(sArr[i].substring(sArr[i].length()-1))-1] = sArr[i].substring(0,sArr[i].length()-1);

		}  
		String strOut = "";    
		for(int i = 0;i<out.length;i++){
			strOut += out[i]+" ";
		}
		return strOut.trim();
	}

}
