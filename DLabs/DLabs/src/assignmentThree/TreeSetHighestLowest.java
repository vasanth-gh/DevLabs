package assignmentThree;

import java.util.TreeSet;

public class TreeSetHighestLowest {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> hset = new TreeSet<Integer>();
		
		hset.add(1);
		hset.add(7);
		hset.add(5);
		hset.add(2);
		hset.add(9);
		hset.add(4);
		
		System.out.println("TreeSet values : " + hset);
		
		System.out.println("Lowest value in TreeSet : " + hset.first());
		System.out.println("Highest value in TreeSet : " + hset.last());
		
		
	}

}
