package mandatoryHomeWork.foundation;

import org.junit.Test;

public class HwReplaceAllDigitsWithCharacters {

	public String replaceDigits(String s) {

		/*Understood - yes 
		 * Input - string with Characters and integers
		 * Output - String without integer
		 * 
		 * PsuedoCode
		 * 1.for iterate through  +2
		 * 2.charAt(i) --> (int)charAt(i+1)
		 * 3. return the String 
		 */
		//	     char[] chrS = s.toCharArray();
		String out = "";
		for (int i = 0; i < s.length()-1; i=i+2) {
			out = out + s.charAt(i); //a
			int k= s.charAt(i+1)-'0'; //1
			char j = (char) (s.charAt(i)+ k);
			out = out + j;
		}
		if(s.length()%2==0) return out+s.charAt(s.charAt(s.length()));
		return out;

	}

	@Test
	public void test1() {
		String actual = replaceDigits("a1c1e1");
				System.out.println(actual);
	}

}
