package lab10_ExceptionCustom;

public class CustomException extends Exception{
	
	int var;
	
	CustomException (int a){
		var = a;
	}
	
	public String toString() {
		return "CustomException[" + var + "]";
	}

}
