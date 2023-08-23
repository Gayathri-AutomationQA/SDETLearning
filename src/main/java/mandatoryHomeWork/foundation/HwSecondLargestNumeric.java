package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class HwSecondLargestNumeric {
	public int secondHighest(String s) {

		  //		s = "dfa12321afd"; //11223
				//		[0,2,2,1,0,0,0...]
				s = s.replaceAll("[a-zA-Z]", "");
				int[] intArr = new int[10];
				for (int ch : s.toCharArray()) {
					intArr[ch-'0']++;
				}
				//		[0,2,2,1,0,0,0...]
				int counter =0;
				int out = 0;
				for (int i = 0; i < intArr.length; i++) {
					System.out.println(intArr[i]);
					if(intArr[i]!=0) {						
						counter++;
						if(counter==2) {
							out = i;
						}
						}
				}
					if(counter<2){
							return -1;
						}else{
										return out;

						}

	}
}
