package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindrome {

	public boolean isPalindromeCheck(int num) {

		//get an interger 
		//convert into a char array 
		//check if first element is same as last element with two variable in iteration through n/2
		//[1,2,3,2,1]

		char[] digits = String.valueOf(num).toCharArray();
		int j =digits.length-1;
		int counter =0;
		for (int i = 0; i < digits.length/2 ; i++) {
			if(digits[i]==digits[j]) {
				counter++;
			}
			j--;
		}
		if(counter==digits.length/2)
			return true;
		else
			return false;
	}

	//Positive
	@Test
	public void Test1() {
		boolean actual = isPalindromeCheck(1221);
		Assert.assertEquals(true, actual);
	}
	//Negative
	@Test
	public void Test2() {
		boolean actual = isPalindromeCheck(-123);
		Assert.assertEquals(false, actual);
	}
	//Edge
	@Test
	public void Test3() {
		boolean actual = isPalindromeCheck(1);
		Assert.assertEquals(true, actual);
	}

}
