package mandatoryHomeWork.algorithms.twoPointers;

public class HW1358_NumberOfSubStrings {

	public int numberOfSubstrings(String s) {
		int k = 3;
		int count =0;
		int[] out = new int[3];
		// boolean flag = true;
		while(k<=s.length()){
			for(int i = 0;i<s.length()-k+1;i++){
				boolean flag = true;
				int left = i;
				int right = i+k;
				System.out.println(s.substring(left,right));

				for(int sub =left;sub<right;sub++){
					out[s.charAt(sub)-'a']++;
				}
				for(int sub =0;sub<out.length;sub++){
					// System.out.println(out[sub]);

					if(out[sub]==0){
						flag = false;
						break;
					}
					out[sub]=0;

				}

				if(flag == true){
					count++;
				}
				// if(s.substring(left,right).contains("a") && s.substring(left,right).contains("b") && s.substring(left,right).contains("c")){
				//     count++;
				// }
			}

			k++;
		}
		return count;
	}


}
