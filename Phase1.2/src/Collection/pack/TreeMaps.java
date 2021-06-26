package Collection.pack;

import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
	
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("Coal", 78);
		tm.put("Wood", 88);
		tm.put("Copper", 55);
		tm.put("Gold", 47);
		tm.put("Silver", 39);
		tm.put("Tin", 90);
		
		for(String key : tm.keySet()) {
			System.out.println(key + " : " + tm.get(key));
		}
	
	}
	
}
