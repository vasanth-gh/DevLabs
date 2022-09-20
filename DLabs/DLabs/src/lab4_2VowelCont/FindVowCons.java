package lab4_2VowelCont;

public class FindVowCons {

	char ch;

	public void setCh(char ch) {
		this.ch = ch;
	}
	
	public void findVowCon() {
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Is a vowel");
			break;
		default:
			System.out.println("Is a consonant");
		}
	}
	
}
