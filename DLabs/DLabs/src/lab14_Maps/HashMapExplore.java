package lab14_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExplore {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Audi",4);
		hmap.put("Bentley",2);
		hmap.put("Lamborgini", 1);
		hmap.put("porsche", 3);
		
		System.out.println("Hash map values : "+ hmap);
		
		Set st = hmap.entrySet();
//		System.out.println("Hash map values : "+ st);
		String findKey = "Bentley";
		
		Iterator itr = st.iterator();
		
		System.out.println("\n---------------Lab 14 - Section 1-------------");
		
		while(itr.hasNext())
		{
//			System.out.println(itr.next());
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println("Key : " + me.getKey() + " ; Value : " + me.getValue());
			
			if(me.getKey() == findKey) {
				System.out.println("Found the key : " + me.getKey());
			}
			
		}
		
		System.out.println("\n---------------Lab 14 - Section 4-------------");
		
		ArrayList<Map.Entry<String, Integer>> lst = new ArrayList<Map.Entry<String, Integer>>(st);
		System.out.println("Converted to List, List values : " + lst);
		
		System.out.println("Printing using Iterator");
		Iterator ilst = lst.iterator();
		while(ilst.hasNext()) {
			System.out.println(ilst.next());
		}
		
	}
}
