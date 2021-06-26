package Collection.pack;

import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

		/*Map <k, v>
		 * |
		 * |-> HashMap
		 * 1. always have unique keys
		 * 2. values can be duplicated
		 * 3. can have only one key as null
		 * 4. can have multiple null values
		 * 5. can retrieve value using key
		 * 
		 * |
		 * |> LinkedHashMap = order is as inserted
		 * 
		 * |
		 * |> TreeMap
		 * 
		 * 1. always have unique keys
		 * 2. values can be duplicate
		 * 3. can only have one key as null
		 * 4. can have multiple null values
		 * 5. with help of key, can retrieve value
		 */
		public static void main(String[] args) {
			Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
			lhm.put(1, new String("Jaina"));
			lhm.put(2, new String("Arthas"));
			lhm.put(3, new String("Lothar"));
			lhm.put(4, new String("Uther"));
			lhm.put(5, new String("Silvanas"));
			lhm.put(6, new String("Thor"));
			
			System.out.println("Content of LinkedHashMap: " + lhm);
			System.out.println("\nValues of map affter iterating over it: ");
			
			for (Integer key : lhm.keySet()) {
				System.out.println(key + ":\t" + lhm.get(key));
			}
			
		}
//	}
}
