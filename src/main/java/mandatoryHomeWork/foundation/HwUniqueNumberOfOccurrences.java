package mandatoryHomeWork.foundation;

import org.junit.Test;

public class HwUniqueNumberOfOccurrences {
	public boolean uniqueOccurrences(int[] arr) {
		String out = "";
		int count =0;
		String outUniqueKeys = "";
		String outUniqueValues = "";
		for (int i : arr) {
			out = out+ i;
		}
		while(out.length()>=1) {
			outUniqueKeys= outUniqueKeys+out.charAt(0);
			out = out.replaceAll(String.valueOf(out.charAt(0)),"");
		}
		for (int i : outUniqueKeys.toCharArray()) {
//			String
			out.replaceAll((out), outUniqueKeys);
		}

		//		}
		return true;

	}
	@Test
	public void test1() {
		boolean actual = uniqueOccurrences(new int[] {1,2,2,1,1,3});
		System.out.println(actual);
	}

}
