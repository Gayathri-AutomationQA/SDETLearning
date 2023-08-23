package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SelfDividingNumbers {
		public List<Integer> SelfDividingNumbers(int left, int right) {
			List<Integer> list = new ArrayList<Integer>();		
			boolean flag;

			for (int n = left; n <= right; n++) {
				if (selfDividing(n)) list.add(n);
			}
			return list;
		}
		public boolean selfDividing(int n) {
			char[] chArr = String.valueOf(n).toCharArray();
			for (char c: chArr) {
				if (c == '0' || (n % (c - '0') > 0))
					return false;
			}
			return true;
		}
		@Test
		public void Test2() {	
			List<Integer> actual = SelfDividingNumbers(1,10);
			System.out.println(actual);
		}
	}
