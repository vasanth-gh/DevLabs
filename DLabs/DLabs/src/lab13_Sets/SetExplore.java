package lab13_Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExplore {
	
	public static void main(String[] args) {
		
		Set<String> str = new HashSet<String>();
		
		str.add("YYY");
		str.add("AAA");
		str.add("MMM");
		str.add("ZZZ");
		str.add("BBB");
		str.add("GGG");
		str.add("VVV");
		
		System.out.println("\n---------------Lab 13 - Section 1-------------");
		System.out.println("Displaying values in Set : " + str);
		System.out.println("Displaying values in Set through Iterator : ");
		Iterator<String> i = str.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\n---------------Lab 13 - Section 2-------------");
		
		System.out.println("Size of HashSet : " + str.size());	
		
		
	}

}
