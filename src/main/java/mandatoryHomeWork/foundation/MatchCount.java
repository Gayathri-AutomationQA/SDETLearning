package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class MatchCount {
	
	class Solution {
	    public int numberOfMatches(int teams) {
	    	   int matches = 0;
		        while(teams!=1){ // 7
		           if(teams%2==0)
				{
					matches=matches+(teams/2);
					teams=teams/2;
					
				}
				else
				{
					matches=matches+((teams-1)/2);
					teams=((teams-1)/2)+1;
					
				}
		    
	            }
				return matches;
	    
	    }
	
	
	@Test
	public void Test1() {	
		int actual = numberOfMatches(8);
		Assert.assertEquals(2, actual);
	}
	@Test
	public void Test2() {	
		int actual = numberOfMatches(10);
		Assert.assertEquals(0, actual);
	}
	@Test
	public void Test3() {	
		int actual = numberOfMatches(12);
		Assert.assertEquals(2, actual);
	}
}
}
