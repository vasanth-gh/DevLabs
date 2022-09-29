package lab7_FindUpperLowerCase;

public class FindUpperLowerCase {
	
	public static void main(String[] args) {
		
		char a;
		String characters = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
		
		System.out.println("String given : " + characters);
		
		System.out.println("\nLower case characters :");
		for(int i=0;i<characters.length();i++) {
			a = characters.charAt(i);
			if(Character.isLowerCase(a)) {
				System.out.print(a + " ");
			}
		}
		
		System.out.println("\n\nUpper case characters :");
		for(int i=0;i<characters.length();i++) {
			a = characters.charAt(i);
			if(Character.isUpperCase(a)) {
				System.out.print(a + " ");
			}
		}
		
	}

}
