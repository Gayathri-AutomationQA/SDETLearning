package mandatoryHomeWork.foundation;
import org.junit.Assert;
//import org.junit.Assert;
import org.junit.Test;
//https://leetcode.com/problems/distribute-candies/description/

public class DistributeCandies {
	int flag =0;
	int counter = 0;
	public int distributeCandies(int[] candyType) {

		for (int i = 0; i < candyType.length; i++) { //i=0 1
			flag=0;
			for (int j = i+1; j < candyType.length; j++) { //j=1 1
				if(candyType[i]==candyType[j])
				{
					flag=1;
					break;
				}
			}
			if(flag!=1) {
				counter++;
			}
		}
		if(candyType.length/2 > counter)
			return counter;
		return candyType.length/2;

	}

	//Positive
	@Test
	public void Test1() {
		int actual = distributeCandies(new int[] {2,2,1});
		Assert.assertEquals(1, actual);
		System.out.println(actual);
	}
	//Negative
	@Test
	public void Test2() {	
		int actual = distributeCandies(new int[] {4,1,2,1,2});
		System.out.println(actual);
		Assert.assertEquals(4, actual);

	}
}
