package core.java.interview.program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

		String[] a = {"Bangalore", "Pune", "Chennai", "Mumbai", "Bangalore", "Pune" };
		
		//1. using for loop time complexity n2
		System.out.println("------ find duplicates using for loop --------");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i].equals(a[j])) {
					System.out.println(a[i]);
				}
			}
		}
		
		//2. using hashset
		System.out.println("------ find duplicates using hashset --------");
		Set<String> dupString = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if(dupString.add(a[i]) == false) {
				System.out.println(a[i]);
			}
		}
		
		//3. using hashmap
		System.out.println("------ find duplicates using hashmap --------");
		Map<String, Integer> map = new HashMap<>();
		for (String city : a) {
			
			Integer count = map.get(city);
			if(count == null) {
				map.put(city, 1);
			}else {
				map.put(city, map.get(city) + 1);
			}
		}
		// Iterate the map
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		
		//4. 
		
		
		
		
		
		
		
		
		
	}

}
