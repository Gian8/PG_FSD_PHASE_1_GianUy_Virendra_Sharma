package Collection.pack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapsExample {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("1", "Wolverine");
		hm.put("2",  "Jean Grey");
		hm.put("3",  "Magneto");
		hm.put("4",  "Cyclops");
		hm.put("5", "Nightstalker");
		
		System.out.println(hm);
		System.out.println("HashMap size is: " + hm.size());
		System.out.println("The value of 3 is: " + hm.get("3"));
		System.out.println("The argument that HashMap is empty is: " + hm.isEmpty());
		
		hm.remove("3");
		System.out.println(hm);
		System.out.println("New HashMap size is: " + hm.size());		
		System.out.println("________________________________");
		
		Map<Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(1,  new String("Marnii"));
		lhm.put(2, new String("Jetthroe"));
		lhm.put(3, new String("Culliver"));
		lhm.put(4,  new String("Jamika"));
		lhm.put(5, new String ("Totodyle"));
		
		System.out.println(lhm);
		System.out.println(lhm.isEmpty());
		System.out.println(lhm.containsKey(5));
		System.out.println(lhm.get(5));
		
		for(Integer Key : lhm.keySet()) {
			System.out.println(Key + " : " + lhm.get(Key));
		}
		System.out.println(lhm.getClass());
		System.out.println("_____________________________");
		
		Set<Integer> keys = lhm.keySet();
		System.out.println("Keys: " + keys);
		for(Integer key : keys) {
			System.out.println(key);
		}
	}
}
