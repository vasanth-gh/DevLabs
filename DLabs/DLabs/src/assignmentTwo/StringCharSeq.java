package assignmentTwo;

public class StringCharSeq {
	
	public static void main(String[] args) {
		
		String s1 = "DevLabsAlliance";
		char[] ch = s1.toCharArray();
		
		System.out.println("String that is getting converted: " + s1);
		
		System.out.println("Elements in String:");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("String length : " + s1.length() + "\nchar Array length : " + ch.length);
		
	}

}
