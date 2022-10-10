//Set View of Keys from HashTable

package assignmentThree;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTblSetView {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> htbl = new Hashtable<Integer, String>();
		htbl.put(1, "1250cc");
		htbl.put(2, "650cc");
		htbl.put(3, "390cc");
		htbl.put(4, "290cc");
		htbl.put(5, "250cc");
		
		Enumeration<Integer> e = htbl.keys();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}		
		
	}
	

}
