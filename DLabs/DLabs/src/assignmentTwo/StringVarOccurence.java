package assignmentTwo;

public class StringVarOccurence {
	
	public static void main(String[] args) {
		
		String s1 = "India is growing in economy";
		char[] ch = s1.toLowerCase().toCharArray();
		String s2 = "";
		System.out.println("Checking for String: " + s1);
		int count;
		for(int i=0;i<ch.length;i++) {
			count = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!=' ' && !s2.contains(String.valueOf(ch[i]))) {
					count = count + 1;
				}
			}
			if(count>1) {
				System.out.println("The character \""+ ch[i] + "\" is repeating : " + count + " times");
				s2 = s2+ch[i];
			}
		}
	}

}
