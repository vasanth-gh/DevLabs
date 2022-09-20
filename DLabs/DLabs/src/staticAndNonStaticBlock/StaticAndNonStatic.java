package staticAndNonStaticBlock;

public class StaticAndNonStatic {
	
	public StaticAndNonStatic() {
		System.out.println("Constructor");
	}
	
	static{
	System.out.println("Static Block 1");
	}
	
	static{
		System.out.println("Static Block 2");	
	}
	
	{
		System.out.println("Non - Static Block 1");	
	}
	
	{
		System.out.println("Non - Static Block 2");	
	}
	
	public static void main(String[] args) {
		System.out.println("Main block");
		
		StaticAndNonStatic objSt = new StaticAndNonStatic();
	}

}
