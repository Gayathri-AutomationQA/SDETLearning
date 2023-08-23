package mandatoryHomeWork.foundation;

import org.junit.Test;

import junit.framework.Assert;

public class ClimbingStairs {

	//	fibonacci series - number is sum of first two numbers
	public int climbStairs(int n) {

		int a = 0;
		int b = 1;
		int out =0;
		if(n>1){
			for (int i = 1; i<=n; i++) {
				//0 1 1 2 3 5 8
				out = a+b; 
				a = b; 
				b = out; 	
				if(i==n){
					System.out.println(out);
				}		

			}
		}else{
			out = 1;
		}

		return out;   
	}
	@Test
	public void Test1() {
		int actual = climbStairs(2);
		Assert.assertEquals(2, actual);
	}


}
