package mandatoryHomeWork.foundation;

public class HwJewelsAndStones {
	public int numJewelsInStones(String jewels, String stones) {

		int count = 0;
		int[] intArr = new int[127];
		for(char ch:  stones.toCharArray() ){
			intArr[ch]++;
		}
		for (int i = 0; i < jewels.length(); i++) {
			count = count + intArr[jewels.charAt(i)];
		}
		return count;
	}
}