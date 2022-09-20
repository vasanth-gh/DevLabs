package lab12_LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		System.out.println("---------------Lab 12 - Section 1-------------");
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Merc");
		ll.add("BMW");
		ll.add("Ferrari");
		ll.add("Mustang");
		ll.add("Audi");
		
		LinkedList<String> l2 = new LinkedList<String>();
		
		System.out.println("Linked list data from ll obj: " + ll);
		
		System.out.println("Linked list data from l2 obj: " + l2);
		
		l2.addAll(ll);
		
		System.out.println("Linked list data after adding ll to l2: " + l2);
		
//		Lab 12 - Section 2
		System.out.println("\n---------------Lab 12 - Section 2-------------");
		
		LinkedList<String> llBooks = new LinkedList<String>();
		llBooks.add("DC");
		llBooks.add("Unix");
		llBooks.add("Java");
		llBooks.add("Networking");
		llBooks.add("DataStructures");
		System.out.println("Objects in LinkedList : " + llBooks);
		
		System.out.println("\n### Printing linked list in forward direction ###");
		Iterator<String> l = llBooks.iterator();
		
		while(l.hasNext()) {
			Object ele = l.next();
			System.out.println(ele + " ");
		}
		
		System.out.println("\n### Printing linked list in backward direction ###");
		Iterator<String> bw = llBooks.descendingIterator();
		
		while(bw.hasNext()) {
			Object element = bw.next();
			System.out.println(element + " ");
		}
		
//		Lab 12 - Section 3
		System.out.println("\\n---------------Lab 12 - Section 3-------------");
		
		System.out.println("\n### Finding Max Value in the List ###");
		
		LinkedList<Integer> intLL = new LinkedList<Integer>();
		intLL.add(12);
		intLL.add(23);
		intLL.add(3);
		intLL.add(45);
		intLL.add(33);
//		intLL.add(null);
		
		System.out.println("Linked List objects : " + intLL);
		
		System.out.println("\nMax val in list : " + Collections.max(intLL));
		System.out.println("\nMin val in list : " + Collections.min(intLL));
		

		
	}
}
