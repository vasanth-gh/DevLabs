package collections;

import java.util.ArrayList;

public class SimpleArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrL = new ArrayList<String>();
		
		arrL.add("Hello");
		arrL.add("World");
		arrL.add("Welcome");
		arrL.add("Again");
		
		System.out.println("Array List size : " + arrL.size());
		System.out.println("Array List values : " + arrL);
		
		
		System.out.println("Retrieving through index: " + arrL.get(0));
		arrL.set(0, "Helloooo");
		System.out.println("Replacing value at index 0: " + arrL);
		
		arrL.remove(0);
		System.out.println("Remove value at index 0: " + arrL);
		
		System.out.println(arrL.contains("Helloooo"));
		
		ArrayList<String> arrL1 = new ArrayList<String>();
		
		arrL1.add("New");
		arrL1.addAll(arrL);
		System.out.println("addAll - joining 2 collection: " + arrL1);
		
		System.out.println("Index of Welcome: " + arrL1.indexOf("Welcome"));
		
		arrL1.add("World");
		System.out.println("Array List values arrL1 : " + arrL1);
		System.out.println("First instance index of World in arrL1: " + arrL1.indexOf("World"));
		System.out.println("Last instance Index of World in arrL1: " + arrL1.lastIndexOf("World"));
	}

}
