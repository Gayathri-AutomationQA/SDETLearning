package mandatoryHomeWork.algorithms;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CW_getDefault {
	
	public void mapAndGetDefault() {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("A", 10);
		System.out.println(map.getOrDefault("B", 0));
		System.out.println(map.getOrDefault("A", 0));

	}
	
	@Test
	public void Test1() {	
		mapAndGetDefault();
//		System.out.println(actual);
	}
}
