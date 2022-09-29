package lab8_StringCmp;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String s1 = "cruise on the road";
		String s2 = "cruise on the road";
		String s3 = "cruise on the ship";
		
		System.out.println("Strings created in ConstantPool:\n" + s1 + "\n" + s2 + "\n" + s3);
		
		System.out.println("----------------Comparing String using CompareTo method----------------");
		
		System.out.println("Comparing s1 and s2: " + s1.compareTo(s2));
		System.out.println("Comparing s1 and s3: " + s1.compareTo(s3));
		System.out.println("Comparing s3 and s2: " + s3.compareTo(s2));
		
		System.out.println("----------------Comparing String using == method----------------");
		
		System.out.println("Comparing s1 and s2: " + (s1==s2));
		System.out.println("Comparing s1 and s3: " + (s1==s3));
		System.out.println("Comparing s3 and s2: " + (s3==s2));
		
		String st1 = "cruise on the road";
		String st2 = new String("cruise on the road");
		String st3 = "cruise on the ship";
		
		System.out.println("\n\nStrings created in ConstantPool String1 and String3:\n" + st1 + "\n" + st3);
		System.out.println("Strings created in both const Pool and Heap String2:\n" + st2);
		
		System.out.println("----------------Comparing String using == method----------------");
		
		System.out.println("Comparing String1 and String2 using ==: " + (st1==st2));

		System.out.println("----------------Comparing String using equals() method----------------");
		
		System.out.println("Comparing String1 and String2 using equals(): " + st1.equals(st2));
		
	}

}
