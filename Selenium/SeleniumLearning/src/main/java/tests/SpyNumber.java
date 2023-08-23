package tests;

import org.testng.annotations.Test;

public class SpyNumber {
	
	public boolean spyNumber(int n) {
		char[] arrNew = String.valueOf(n).toCharArray();
		int sum = 0;
		int product =1;
		for (int i = 0; i < arrNew.length; i++) {
			sum += arrNew[i]-'0';
			product*=arrNew[i]-'0';
			System.out.println(sum);
			System.out.println(product);
		}
		if(sum==product) {
			return true;
		}else {
			return false;
		}
	}
	@Test
	public void Test1() {	
		boolean actual = spyNumber(1000);
		System.out.println(actual);
	}
}