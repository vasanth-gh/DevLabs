/**If the superclass method does not declare an exception
If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception 
but it can declare unchecked exception.

If the superclass method declares an exception
If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception 
but cannot declare parent exception.*/



package lab10_3ExceptionOverridding;

import java.io.IOException;

public class OverridingChildEx1 extends OverridingParentEx1{
	
/**	Rule 1: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception. */
//	public void ovrMethod() throws IOException {
//		System.out.println("Parent class constructor");
//	}
	
/**	Rule 2: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception 
	but can declare unchecked exception.*/
	public void ovrMethodUnChkd() throws ArithmeticException{
		System.out.println("Child class method");
	}
	
/**	If the superclass method declares an exception, subclass overridden method can declare the same subclass exception or no exception 
	but cannot declare parent exception.*/
//	public void ovrMethodParentExp() throws Exception {
//		System.out.println("Child class method");
//	}
	
	public void ovrMethodParentExp() throws Exception {
		System.out.println("Child class method");
	}
	
	public void ovrMethodParentExp1() throws ArithmeticException {
		System.out.println("Child class method");
	}
	
	
//	
//	public static void main(String[] args) {
//		OverridingChildEx1 ovrE = new OverridingChildEx1();
//		ovrE.ovrMethodParentExp();
//	}

}
