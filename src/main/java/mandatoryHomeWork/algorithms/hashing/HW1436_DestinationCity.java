package mandatoryHomeWork.algorithms.hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HW1436_DestinationCity {

	public String destCity(List<List<String>> paths) {

		// Array paths : paths[i] = [cityAi , cityBi] 

		// Add the in 0 index as 1 and 1 index as -1
		// if -1  return city name
		String cityName = null;
		Map<String, Integer> map = new HashMap<>();
		for(List<String> list : paths){
			if(map.containsKey(list.get(0))) {
				map.put(list.get(0),map.get(list.get(0)+1));
			}else {
				map.put(list.get(0),1);
			}
			if(map.containsKey(list.get(1))) {
				map.put(list.get(1),(map.get(list.get(1))-1));
			}else {
				map.put(list.get(1),-1);
			}
		}
		for (Map.Entry<String, Integer> list : map.entrySet()) {
			if(list.getValue()==-1) {
				cityName = list.getKey();
			}
		}
		return cityName;
	}

}
