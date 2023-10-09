package mandatoryHomeWork.algorithms.twoPointers;

import org.testng.annotations.Test;

public class CW1052_GrumpyBookStore {
	
//	1. Understood: Yes
//	2.
//	
	 public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
		 int pointer = 0; int n = customers.length ;
	        int range = minutes; int nonGrumpySum =0;
	        int changingCount =0; int currentGrumpySum =0;

	        for(int i = 0;i<n;i++){
	            if(grumpy[i]==0){
	                nonGrumpySum += customers[i];
	            }
	        }
	        int right = 0;
	        while(right<minutes){
	            if(grumpy[right]==1){
	                changingCount =+ customers[right];
	                System.out.println(changingCount);
	            }
	            right++;
	        }
	        currentGrumpySum = changingCount+nonGrumpySum;

	        
	        while(right<n){
	            if(grumpy[pointer]==1){
	                changingCount = changingCount-customers[pointer];
	            }
	            if(grumpy[right]==1){
	                changingCount = changingCount+customers[right];
	            }

	        currentGrumpySum = Math.max(currentGrumpySum,changingCount);

	            right++;
	            pointer++;
	        }
	        return currentGrumpySum;
		 
		 	        
	    } 
	 
	 @Test
		public void Test1() {	
			int actual = maxSatisfied(new int[] {1,0,1,2,1,1,7,5},new int[] {0,1,0,1,0,1,0,1},3);
			System.out.println(actual);
		}

}
