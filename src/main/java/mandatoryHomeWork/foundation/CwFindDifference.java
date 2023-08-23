package mandatoryHomeWork.foundation;

public class CwFindDifference {
	public char findTheDifference(String s, String t) {
		//1. t -- greater than s
		//2. for loop 
		   int tSum = 0;
	        int sSum = 0;

	        for(int i=0;i<s.length();i++){

	            tSum = tSum+t.charAt(i);
	            sSum = sSum+s.charAt(i);

	        }
	        tSum = tSum+t.charAt(t.length()-1);
	        char ch = (char)(tSum-sSum);

	        return ch;
	}
}