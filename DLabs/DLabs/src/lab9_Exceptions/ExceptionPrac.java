package lab9_Exceptions;

public class ExceptionPrac {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,2,3};
		int sum;
		
		try {
			System.out.println("Inside try block before exception");
			sum = a[0]+a[5];
			System.out.println("Inside try block after exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Inside catch block");
			e.printStackTrace();
		}
		
		catch(Exception e){
			System.out.println("Inside catch block Exception");
			e.printStackTrace();
		}		
		
		
		System.out.println("After try catch block");
		
	}

}
