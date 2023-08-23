package mandatoryHomeWork.foundation;

import org.junit.Test;

public class AddDigits {
	public int addDigits(int num) {
		int out;
		while(num > 9) {
			out =0;
			char [] chars = String.valueOf(num).toCharArray();
			for (int i = 0; i < chars.length; i++) {
				out = out + (Character.getNumericValue(chars[i]));
			}
			num = out;

		}
		return num;
	}
	@Test
	public void Test2() {	
		int actual = addDigits(38);
		System.out.println(actual);
	}
}
