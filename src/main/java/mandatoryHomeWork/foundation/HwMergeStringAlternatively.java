package mandatoryHomeWork.foundation;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class HwMergeStringAlternatively {
	public String mergeAlternately(String word1, String word2) {

		int len = (word1.length()>word2.length()) ? word1.length()*2 : word2.length()*2;
		char[] chArr = new char[len];
		System.out.println(len);

		String out = "";
		int l =0;
		for (int i = 0; i < chArr.length-1; i++) {
			for (int j = 0; j < word1.length()-1; j++) {
				chArr[l]=word1.charAt(j);
				l=l+2;
				System.out.println(j);
			}
			l = 1;
			for (int k = 1; k < word2.length()-1; k++) {
				chArr[l]=word2.charAt(k);
				l=l+2;
//				System.out.println(word2.charAt(k));
			}
		}

		for (int i = 0; i < chArr.length-1; i++) {
			out = out + chArr[i];
		}
//		System.out.println(out);
		return out.replaceAll("", "");
	}
	//Positive
	@Test
	public void Test1() {
		String actual = mergeAlternately("abc","pbq");
//		System.out.println(actual);
		Assert.assertEquals("apbbcq", actual);
	}
}
