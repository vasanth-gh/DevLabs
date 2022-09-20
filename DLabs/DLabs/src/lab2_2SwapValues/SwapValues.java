package lab2_2SwapValues;

public class SwapValues {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before swap variable a : " + a + " variable b : " + b);
		
		a = a+b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap variable a : " + a + " variable b : " + b);
		
		 
	}
	
}
