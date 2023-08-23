package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class HwFirstPalindromicStringInArray {
	public String firstPalindrome(String[] words) {
		//["abc","car","ada","racecar","cool"]
		String firstOut;
		String outRev ;
		for (int i = 0; i < words.length; i++) {
			 firstOut = "";
			 outRev = "" ;
			char[] wordNew = words[i].toCharArray();
			for (int j = 0; j < wordNew.length; j++) {
				firstOut = firstOut + wordNew[j];
				System.out.println(firstOut);
			}
			for (int j2 = wordNew.length-1; j2 >=0; j2--) {
				outRev = outRev + wordNew[j2];
				System.out.println(outRev);
			}
			if (firstOut.equals(outRev)) {
				return firstOut;
			}
		}
		return "";  
	}

	//Positive
	@Test
	public void Test1() {
		String actual = firstPalindrome(new String[] {"abc","car","ada","racecar","cool"});
//		System.out.println(actual);
		Assert.assertEquals(actual, "ada");
	}

}