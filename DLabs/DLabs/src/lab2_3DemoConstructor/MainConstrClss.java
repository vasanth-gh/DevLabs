package lab2_3DemoConstructor;

public class MainConstrClss {

	public static void main(String[] args) {
		int x = 11;
		int y = 22;
		
		DemoConstrClss consObj = new DemoConstrClss(x,y);
		
		int sum = consObj.addVals();
		System.out.println("Sum of " + x + " and " + y + " = " + sum );
		
	}
}
