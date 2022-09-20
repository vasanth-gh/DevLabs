package lab14_Maps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTbl {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(1, "Ladakh");
		ht.put(3, "Andaman");
		ht.put(2, "Shimla");
		ht.put(5, "Lakshadweep");
		ht.put(4, "Coorg");
		System.out.println("Hashrable values : "+ ht);
		
		System.out.println("\n---------------Lab 14 - Section 2-------------");
		
		Set st = ht.entrySet();
		
		Iterator itr = st.iterator();
		
		while(itr.hasNext()) {
			Map.Entry me = (Entry) itr.next();
			System.out.println("Key:" + me.getKey() + " - Value : " + me.getValue());
		}
		
		System.out.println("\n---------------Lab 14 - Section 3-------------");
		ht.remove(2);
		System.out.println("\nHashtable values after removing object with key 2 : \n"+ ht);
		
		
	}
}
