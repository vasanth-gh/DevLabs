package assignmentThree;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
	
	public static void main(String[] args) {
		
		ArrayList<String> st = new ArrayList<String>();
		st.add("Cricket");
		st.add("FootBall");
		st.add("Hockey");
		
		System.out.println("Elements in list before reversing : " + st);
		
		Collections.reverse(st);
		
		System.out.println("Elements in list after reversing : " + st);
		
	}

}
