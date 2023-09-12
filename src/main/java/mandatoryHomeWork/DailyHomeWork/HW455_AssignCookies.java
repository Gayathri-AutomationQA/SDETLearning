package mandatoryHomeWork.DailyHomeWork;

import java.util.Arrays;

import org.testng.annotations.Test;

public class HW455_AssignCookies {

	public int findContentChildren(int[] g, int[] s) {

		Arrays.sort(s);
		Arrays.sort(g);
		int count = 0;
		int length = (g.length>s.length)? s.length:g.length;
		for (int i = 0; i < length; i++) {
			if(s[i]>=g[i]) count++;
		}
		return count;


//		int leng=g.length;
//		int lens=s.length;
//		int count=0;
//		int i=0;
//		int j=0;
//		Arrays.sort(s);
//		Arrays.sort(g);
//		while(i<leng && j<lens){
//			if(s[j]>=g[i]){
//				count++;
//				i++;
//				j++;
//			}
//			else{
//				j++;
//
//			}
//		}
//
//		return count;
	}



@Test
public void Test1() {
	int actual = findContentChildren(new int[] {1,2,3},new int[] {1,1});
	System.out.println(actual);
}
@Test
public void Test2() {
	int actual = findContentChildren(new int[] {1,2},new int[] {1,2,3});
	System.out.println(actual);
}

}
