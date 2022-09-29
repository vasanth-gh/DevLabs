package lab8_StrBuilder_Buffer;

public class StringBuidrBuffr {
	
	public static void main(String[] args) {
		
		StringBuilder str1 = new StringBuilder("Hello ");
		StringBuilder str2 = new StringBuilder("World");
		
//		str2 = "World";
		
		str1.append(str2);
		
		System.out.println("StringBuilder appending str1 and str2 : " + str1);
		
		
		StringBuffer s1 = new StringBuffer("Hello ");
		StringBuffer s2 = new StringBuffer("World");
		
//		str2 = "World";
		
		s1.append(s2);
		
		System.out.println("StringBuffer appending s1 and s2 : " + s1);
		
	}

}
