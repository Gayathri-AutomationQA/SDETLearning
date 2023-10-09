package mandatoryHomeWork.algorithms.hashing;

import java.util.Arrays;

public class MyHashMap {


	int[] array = new int[16];

	public MyHashMap() {
		
		Arrays.fill(array,-1);

	}

	public void put(Integer key, int value) {
		int hashCode = key.hashCode();
		array[hashCode] = value;
	}

	public int get(Integer key) {
		int hashCode = key.hashCode();
		return array[hashCode];
	}

	public void remove(int key) {
		array[key] = -1;
	}
	public static void main(String args[]) {
		MyHashMap obj = new MyHashMap();
		obj.put(1,2);
		int param_2 = obj.get(1);
		obj.remove(1);
		System.out.println(param_2);
	}

}
