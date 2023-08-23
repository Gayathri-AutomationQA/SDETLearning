package mandatoryHomeWork.foundation;
import org.junit.Test;

public class CwArrangingCoins {


	//Get input array and variable x
	// Output  : Number of occurrence

	// 1. For loop 
	// 2. Compare the array [i] to x , if condition 
	// 3. Counter j  ++ if found else proceed
	// 4. return the counter after the for loop

	public int arrangeCoins(int n) {
		int completeRow=0;
		for (int coinCount = 0; coinCount <= n; coinCount++) {
			if(n>=coinCount) {
				n = n-coinCount;
			}else {
				break;
			}
			completeRow = coinCount;
		}
		return completeRow;
	}
}





