package assignmentOne;

public class FactorialOfNumber {
	
	int fNum;
	int val = 1;
	
	public FactorialOfNumber(int num) {
		this.fNum = num;
	}
	
	public int fact() {
		int i = 1;
		while(i < fNum) {
			val = val * (i+1);
			i = i+1;
		}		
		return val;
	}
	
	public static void main(String[] args) {
		
		int num=8;
		int factVal;
		FactorialOfNumber fon = new FactorialOfNumber(num);
		factVal = fon.fact();
		
		System.out.println("Factorial value of " + fon + " is : " + factVal);
				
	}


}
