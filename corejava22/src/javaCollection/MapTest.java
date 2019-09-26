package javaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
		//Map<String, String> hmap = new HashMap<String, String>();
		
		//Map<String, String> hmap = new TreeMap<String, String>();
		
		Map<String, String> hmap = new LinkedHashMap<String, String>();
		
		hmap.put("Kathmandu", "014");
		hmap.put("Bhaktapur", "016");
		hmap.put("Lalitpur", "015");
		hmap.put("Kailali", "091");
		hmap.put("Doti", "094");
		
		for(String key : hmap.keySet()) {
			
			System.out.println(key+" "+hmap.get(key));
		}
		
	}
	
}
