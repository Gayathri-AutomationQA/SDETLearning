package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class CwPowerOfTwo {
//	Given an integer n, return true if it is a power of two. Otherwise, return false.
// integer n is a power of two, if there exists an integer x such that n == 2x.
	
	/*
	 * psuedoCode
	 * 
	 * 1. input = n; 2. for i=0 to n 3. do 2 to power of i 4. if 2(i) == n return
	 * true return false
	 */
	
	public boolean ifPowerOfTwo (int n) {

			if(n<=0) 
				return false;
      while(n%2 ==0) {
			n = n/2;
		}
		boolean out = n==1? true :false;
		return out;
    
	}
	
	//Positive
		@Test
		public void Test1() {
			boolean actual = ifPowerOfTwo(6);
			Assert.assertEquals(false, actual);
		}
}
