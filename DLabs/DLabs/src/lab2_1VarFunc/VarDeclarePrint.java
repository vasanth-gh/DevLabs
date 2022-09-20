package lab2_1VarFunc;

public class VarDeclarePrint {
	int a;
	float b;
	char ch;
	
	public void initialize(int a,float b,char ch) {
		this.a = a;
		this.b = b;
		this.ch = ch;
	}
	
	public void printVar() {
		System.out.println("Integer : " + a);
		System.out.println("Float : " + b);
		System.out.println("Character : " + ch);
	}

}
