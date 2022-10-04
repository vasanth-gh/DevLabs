package assignmentTwo;

public class NestedTry {
	
	public static void main(String[] args) {
		
		try {
			int[] arr = {2,0,6,4};
			try {
				int div = arr[0]/arr[1];
			}catch (ArithmeticException ae) {
				System.out.println("Divide by zero");
			}
			arr[4]=11;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception");
		}
		
	}

}
