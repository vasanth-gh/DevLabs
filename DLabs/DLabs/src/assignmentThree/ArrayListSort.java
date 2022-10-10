package assignmentThree;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	
	public static void main(String[] args) {
		
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("bmw");
		strArr.add("merc");
		strArr.add("audi");
		strArr.add("lamborgini");
		strArr.add("porsche");
		
		System.out.println("ArrayList before sorting : " + strArr);
		Collections.sort(strArr);
		System.out.println("ArrayList after sorting : " + strArr);
		
		
		
	}

}
