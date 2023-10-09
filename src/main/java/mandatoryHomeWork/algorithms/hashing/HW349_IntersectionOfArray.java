package mandatoryHomeWork.algorithms.hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HW349_IntersectionOfArray {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> setOut = new HashSet<>();
		Set<Integer> set = new HashSet<>();
		for(int index =0;index<nums1.length;index++){
			set.add(nums1[index]);
		}

		for(int index =0;index<nums2.length;index++){
			if(set.contains(nums2[index])){
				setOut.add(nums2[index]);
			}
		}
		int[] out = new int[setOut.size()];
		int i =0;
		Iterator<Integer> j = setOut.iterator(); 


		while(j.hasNext()){
			out[i] = j.next();
			i++;
		}

		return out;
	}
	
	@Test
	public void test1() {
		int[] actual = intersection(new int[] {1,2,2,1}, new int[] {2,2});
		Assert.assertArrayEquals(actual, new int[] {2});
	}
}
