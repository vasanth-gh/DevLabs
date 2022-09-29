package lab7_OtherStringMethods;

public class StringMethods {

	public static void main(String[] args) {
		
		System.out.println("--------------Concatenating Strings--------------");
		String str1 = "Zoom on the ";
		String str2 = "ROAD";
				
		System.out.println("String 1 : " + str1);
		System.out.println("String 1 : " + str2);
		
		str1 = str1.concat(str2);
		
		System.out.println("String 1 and String 2 concatenated : " + str1);
		
		System.out.println("\n--------------Trimming Strings--------------");
		String s1 = "   She sells sea shells on the sea shore   ";
		System.out.println("String before trimming : \n" + s1);
		s1 = s1.trim();
		System.out.println("String After trimming : \n" + s1);
		
		System.out.println("\n--------------Replace char P with F--------------");
		String s2 = "Pan Pun Prank Pit Pat";
		System.out.println("Actual String : " + s2);
		s2 = s2.replace('P', 'F');
		System.out.println("String after replacing P with F : " + s2);
	
	}
	
}
