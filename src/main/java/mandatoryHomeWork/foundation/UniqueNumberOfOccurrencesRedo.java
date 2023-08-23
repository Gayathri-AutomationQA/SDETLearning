package mandatoryHomeWork.foundation;

//https://leetcode.com/problems/unique-number-of-occurrences/description/
/* 1) Did I understand the problem? - Yes

 * 2) Test data set 
 * 	1. arr = [1,2,2,1,1,3]
		Output: true
 * 3) Do I know how to solve it? -> Yes

 * 4) Ask for hint (If you do not know how to solve) - No 
 *
 * 5) // Do I know alternate solutions as well? Yes

 * 6) // If you know alternate solutions -> find out the O Notations (Performance)

 * 7) Start always with psuedo code --> 
 * 
 * 	On notepad
 *
 * 8) Implement them in the code (editor)
 *
 * 9) Test against the different data set
 *
 * 10) If it fails, debug them to solve it !!
 *
 */
public class UniqueNumberOfOccurrencesRedo {

	 public boolean uniqueOccurrences(int[] arr) {
			char[] chArr = new char[2001];
				for (int i : arr) {
					chArr[i+1000]++;
				}
				for (int i = 0; i < chArr.length; i++) {
					for (int j = i+1; j < chArr.length; j++) {
						if(chArr[i]>0){
							if(chArr[i]==chArr[j]) {
								return false;
							}
						}

					}
				}
				return true;

			// for(int i=0;i<arr.length;i++)
	    //     {
	    //         arr[i]+=1000;
	    //     }
	    //     int[] n=new int[2001];
	    //     int min=Integer.MAX_VALUE;
	    //     int max=Integer.MIN_VALUE;
	    //     for(int i=0;i<arr.length;i++)
	    //     {
	    //         n[arr[i]]+=1;
	    //         if(arr[i]<min)
	    //         {
	    //             min=arr[i];
	    //         }
	    //         if(arr[i]>max)
	    //         {
	    //             max=arr[i];
	    //         }
	    //     }
	    //     for(int i=min;i<=max;i++)
	    //     {
	    //         if(n[i]==0)continue;
	    //         for(int j=min;j<=max;j++)
	    //         {
	    //             if(i==j)
	    //                 continue;
	    //             if(n[i]==n[j])
	    //                 return false;
	    //         }
	    //     }
	    //     return true;
	    }


}
