package mandatoryHomeWork;

import org.junit.Test;

public class CalculateMoneyInLeetcodeBank {
	public int totalMoney(int n) {
		int sum = 0;
		int mondayValue = 0;
		int otherDayValue = 0;

		for (int i = 1; i <= n; i++) {

			  if (i % 7 == 1) {
				  mondayValue++;
				  sum += mondayValue;
				  otherDayValue = mondayValue;
	            } else {
	            	otherDayValue++;
	                sum += otherDayValue;
	            }
			
		}
		return sum;
	}

	 @Test
		public void Test2() {	
			int actual = totalMoney(10);
			System.out.println(actual);
		}

}
