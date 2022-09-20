package lab11_ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("To");
		al.add("Test");
		al.add("arrL");
		al.add("In");
		al.add("Java");
		
		System.out.println("ArrayList contains : " + al);
		
//		Retrieving index of an ArrayList obj
		System.out.println("Retrieving index of Object \"Test\" : " + al.indexOf("Test"));
		
//		Replacing obj with index 3 to inside
		al.set(3, "Inside");
		
		System.out.println("3rd Index replaced : " + al);
		
//		Searching an element in ArrayList
		
		System.out.println("Searhing for obj \"Java\" in ArrayList, Found : " + al.contains("Java"));
		System.out.println("Searhing for obj \"In\" in ArrayList, Found : " + al.contains("In"));
		
		
	}

}
