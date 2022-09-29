package lab9_Exceptions;

public class ThrowExcep {
	
	public static void main(String[] args) {
		
		try {
			thrMethod();
		}
		
		catch (Exception e){
			System.out.println("Recaught in main");
		}
		
	}
	
	
	static void thrMethod() {
		try {
			throw new NullPointerException();
		}
		
		catch(Exception e) {
			System.out.println("Caught inside thrMethod");
			throw e;
		}
	}

}
