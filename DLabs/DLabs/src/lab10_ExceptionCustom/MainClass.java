package lab10_ExceptionCustom;


public class MainClass {

	static void testMethod(int x) throws CustomException{
		System.out.println("Called testMethod : " + x);
		if(x>5)
			throw new CustomException(x);
		System.out.println("No Exception");
	}
	
	public static void main(String[] args) {
		
		try {
			testMethod(1);
			testMethod(8);
		}
		catch(CustomException ce) {
			System.out.println("Caught : " + ce);
		}
		
	}
	
	
}
