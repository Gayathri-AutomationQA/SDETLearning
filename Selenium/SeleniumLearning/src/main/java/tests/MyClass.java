package tests;

import org.testng.annotations.Test;

public class MyClass {

	/*
    Given two array, arr1, and arr2
    Subtract the sum of arr2 with arr1 respective index value, and also the sum should exclude the respective index in arr2

     arr1 = {1,2,3,4} , arr2 = {2,3,4,5}

     output = {
     3+4+5-1,
     2+4+5-2,
     2+3+5-3,
     2+3+4-4     
	 */

	public int[] myClass(int[] arr1 , int[] arr2){
		int sum;
		int count = 0;

		int[] outArr = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			sum =0;
			for (int j = 0; j < arr2.length; j++) {
				count++;
				if (i==j) {
					sum -= arr1[i];
				}else {
					sum += arr2[j];
				}
				outArr[i]=sum;

			}		
		}
		System.out.println(count);
		return outArr;
	}

	@Test
	public void Test1() {	
		int[] actual = myClass(new int[] {1,2,3,4,6},new int[] {2,3,4,5,6});
		for (int i = 0; i < actual.length; i++) {
			System.out.println(actual[i]);
		}
		//		System.out.println(actual);
	}
}
