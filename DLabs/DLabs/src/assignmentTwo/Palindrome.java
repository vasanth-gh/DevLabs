package assignmentTwo;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s1 = "trurt";
		System.out.println("String to be checked for Palindrome : " + s1);
		
		char[] ch = s1.toCharArray();
		String revStr="";
		
		for(int i=ch.length-1;i>=0;i--) {
			revStr = revStr + ch[i];
		}
		
		System.out.println("String after reversing : " + revStr);
		
		if(s1.equals(revStr)) {
			System.out.println("String is a palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}		
		
	}

}
