package mandatoryHomeWork;

public class AlternatingDigitSum { public int alternateDigitSum(int n) {
	
	//Approach one

//	String s = String.valueOf(n);
//	int sum = 0;
//	for (int i = 0; i < s.length(); i++) {
//		if(i%2!=0) {
//			sum = sum - (s.charAt(i)-'0');
//		}else {
//			sum = sum - (s.charAt(i)-'0');
//		}
//
//	}
	
	//Approach 2
	int sum = 0;
	int j =0;
	while (n>0) {
			n = n/10;
			if(j%2!=0) {
				sum = sum - n;
			}else {
				sum = sum + n;
			}
			j++;
	}
	
	return sum;
}



}
