package lab13_Sets;

import java.util.TreeSet;

public class TreeSetExplore {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(33);
		ts.add(25);
		ts.add(87);
		ts.add(15);
		ts.add(45);
		ts.add(67);
		
		System.out.println("Existing values in treeset : " + ts);
		
		System.out.println("Lowest value in treeset : " + ts.first());
		System.out.println("Highest value in treeset : " + ts.last());
		
		System.out.println("\n---------------Convert TreeSet to an Integer Array-------------");
		
		Integer[] trArr = new Integer[ts.size()];		//Need create array of type Int using Wrapper class
		ts.toArray(trArr);
		
		for(int i = 0; i<trArr.length; i ++)
		{
		System.out.println("trArr[" + i + "] value : " + trArr[i]);
		}
		
	}

}
