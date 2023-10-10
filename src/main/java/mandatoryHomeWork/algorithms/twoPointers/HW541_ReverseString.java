package mandatoryHomeWork.algorithms.twoPointers;

public class HW541_ReverseString {
	public String reverseStr(String s, int k) {

		int i =0;
		char[] out = s.toCharArray();

		while(i<s.length()){

			int j = Math.min(i+k-1,s.length()-1);
			int i1= i; int j1=j;
			while(i1<j1){
				char temp = out[i1];
				out[i1] = out[j1];
				out[j1] = temp;
				i1++;
				j1--;
			}

			i+=2*k;

		}
		return new String(out);
	}
}
