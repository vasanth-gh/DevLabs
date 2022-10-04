package assignmentTwo;

public class ReThrowExcep {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		try {
			thwMethod(num1, num2);
		}catch (Exception e){
			System.out.println("Recaught in main");
		}
	}
	
	public static void thwMethod(int n1, int n2) throws ArithmeticException{
		
		try {
		int div = n1/n2;
		System.out.println(div);
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
			throw ae;
		}
	}
	
}
