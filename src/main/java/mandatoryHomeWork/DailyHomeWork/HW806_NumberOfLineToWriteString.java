package mandatoryHomeWork.DailyHomeWork;

public class HW806_NumberOfLineToWriteString {
	
	 public int[] numberOfLines(int[] widths, String s) {
			
			int[] outSum = new int[2];
			outSum[0] = 1;
			//iterate through String s
			for(int i =0;i<s.length();i++){
				outSum[1] += widths[s.charAt(i)-'a'];
					if(outSum[1] <= 100){
						System.out.println(outSum[1]);
					}else{
						outSum[0]++;
						outSum[1] = 0;
						outSum[1] += widths[s.charAt(i)-'a'];
					}
				}
		return outSum;
 }

}
