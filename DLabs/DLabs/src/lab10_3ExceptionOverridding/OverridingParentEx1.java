package lab10_3ExceptionOverridding;

public class OverridingParentEx1 {
	
	public void ovrMethod() {
		System.out.println("Parent class method");
	}
	
	
	public void ovrMethodUnChkd() {
		System.out.println("Parent class method");
	}
	
	
//	public void ovrMethodParentExp() throws ArrayIndexOutOfBoundsException {
//		System.out.println("Parent class method");
//	}
	
	public void ovrMethodParentExp() throws Exception {
		System.out.println("Parent class method");
	}
	
	public void ovrMethodParentExp1() throws Exception {
		System.out.println("Child class method");
	}
	

}



