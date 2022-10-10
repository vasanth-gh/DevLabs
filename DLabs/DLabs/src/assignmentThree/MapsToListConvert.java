package assignmentThree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsToListConvert {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("Tennis", 2);
		hmap.put("Golf", 3);
		hmap.put("Cricket", 1);
		
		System.out.println("Map entries: " + hmap);
		
		Set set = hmap.entrySet();
		
		Iterator i = set.iterator();
		
		ArrayList<String> arrL = new ArrayList<String>();
		
		while(i.hasNext()) {
			Map.Entry me = (Entry) i.next();
			System.out.println(me.getKey());
			arrL.add((String) me.getKey());
		}
		
		System.out.println("ArrayList holding keys : " + arrL);
		
		//Other way converting map to list
		System.out.println("\nArrayList holding keys from map - other way to convert: ");
		List<String> l = new ArrayList<String>(hmap.keySet());
		for (String s : l) {
		    System.out.println(s);
		}
		
		
		
	}

}
