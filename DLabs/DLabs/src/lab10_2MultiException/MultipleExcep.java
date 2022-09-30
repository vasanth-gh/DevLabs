package lab10_2MultiException;

public class MultipleExcep {
	
	public static void main(String[] args) {
		
		try {
			int[] arr = {1,2};
//			arr[2]=3;
			arr[2]=3/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		}
		catch(ArithmeticException ae){
			System.out.println("divide by zero - arithmetic exception");			
		}
		
		catch(Exception e) {
			System.out.println("Parent class Exception cannot be above its subclass exceptions");
		}
		
	}

}
