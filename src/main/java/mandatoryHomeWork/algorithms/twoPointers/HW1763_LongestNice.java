package mandatoryHomeWork.algorithms.twoPointers;

public class HW1763_LongestNice {
	public String longestNiceSubstring(String s) {
		String longestNice = "";
		for(int i = 0;i<s.length();i++){
			for(int j= i+1;j<s.length();j++){
				String str = s.substring(i,j);
				boolean flag = true;

				for(char ch : str.toCharArray()){
					if(Character.isLowerCase(ch) && !str.contains(Character.toUpperCase(ch)+"")){
						flag = false;
						break;
					}
					if(Character.isUpperCase(ch) && !str.contains(Character.toLowerCase(ch)+"")){
						flag = false;
						break;
					}

				}
				if(flag == true && longestNice.length()<str.length()) longestNice = str;

			}
		}

		return longestNice;


	}

}
