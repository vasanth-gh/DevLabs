package assignmentThree;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableSearchKey {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> HTbl = new Hashtable<String, Integer>();
		
		HTbl.put("Hockey", 2);
		HTbl.put("Cricket", 1);
		HTbl.put("Kabadi", 3);
		HTbl.put("Football", 4);
		
		System.out.println("Elements in the HashTable : " + HTbl);
		
		Set set = HTbl.entrySet();
		
		Iterator i = set.iterator();
		
		System.out.println("Searching for Key \"Cricket\"");
		
		while(i.hasNext()) {
			Map.Entry me = (Entry) i.next();
			if (me.getKey() == "Cricket"){
				System.out.println("Key found : " + me.getKey());
				System.out.println("value of that Key is : " + me.getValue());
			}
			
		}
		
		
		
		
	}

}
