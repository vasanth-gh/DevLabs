package assignmentTwo;

public class StringArrays {
	
	public static void main(String[] args) {
		
		String s1 = "This is a String";
		System.out.println("String s1: " + s1);
		
		char[] ch = s1.toCharArray();
		System.out.println("String converted to charArray:");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("Converting charArray back to String:");
		String s2 = new String(ch);
		System.out.println(s2);
		
//		Using valueOf()
		System.out.println("Converting charArray back to String using valueOf():");
		String s3 = String.valueOf(ch);
		System.out.println(s3);
		
//		Using copyValueOf()
		System.out.println("Converting charArray back to String using copyValueOf():");
		String s4 = String.copyValueOf(ch);
		System.out.println(s4);
		
	}

}
