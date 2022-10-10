package assignmentThree;

import java.util.HashSet;

public class HashSetToArrayObj {
	
	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("a");
		hset.add("b");
		hset.add("c");
		hset.add("d");
		System.out.println("HashSet values : " + hset);
		
		Object[] s = hset.toArray();
		
		for(Object n : s) {
			System.out.println(n);
		}
		
	}

}
