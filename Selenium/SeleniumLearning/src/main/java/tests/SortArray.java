package tests;

import org.testng.annotations.Test;

public class SortArray {

	public int sortArray(int n) {
//		int temp;
//
//		for (int i = 0; i < chArr.length; i++) { //5,4,3,2,6
//			for (int j = i+1; j < chArr.length; j++) {
//				if(chArr[i]<chArr[j]) {
//					temp = chArr[i];
//					chArr[i] = chArr[j];
//					chArr[j]=temp;
//				}
//			}
//			
//		}
//		return chArr;
		
		int x = n;
		int y;
		int count =0;

				while (x > 0) {

					y = n;

				while (y > 0) {
					count++;
					y = y/2;

				}

				x--;
				}
				System.out.println(count);
				return count;

	}
	@Test
	public void Test1() {	
		int actual = sortArray(4);
//		for (int i = 0; i < actual.length; i++) {
//			System.out.println(actual[i]);
//			
//		}
	}

}
