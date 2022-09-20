package lab4_1IfElse;

public class LargestOfThreeNums {

	int a;
	int b;
	int c;
	
	public int largestNum(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		if(a>b && a>c){
			return a;
		}
		else if(b>c) {
			return b;
		}
		else
			return c;
		
	}
	
}