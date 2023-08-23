package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Test;


/*
 * Understood -- No, but trying logic for whatever logic is understood
 * Input int[]
 * Output int[] - largest +1 
 */

public class HwPlusOne {
	public int[] plusOne(int[] digits) {

	    
		for (int i =  digits.length-1 ; i >=0; i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		digits = new int[digits.length + 1];
		digits[0] =1;
		return digits;
	}

	@Test
	public void test1() {
		int[] actual = plusOne(new int[] {4,3,2,1});
		System.out.println(actual);
	}
}
