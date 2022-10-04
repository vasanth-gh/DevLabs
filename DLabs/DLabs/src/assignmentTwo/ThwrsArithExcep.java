package assignmentTwo;

public class ThwrsArithExcep {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		System.out.println(thwMethod(num1, num2));
		
	}
	
	public static int thwMethod(int n1, int n2) throws ArithmeticException{
		int div = n1/n2;
		return div;
	}

}
