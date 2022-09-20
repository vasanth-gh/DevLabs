package lab2_1VarFunc;

public class VarDeclrMain {

	public static void main(String[] args) {
		int i = 10;
		float j = 27.04f;
		char ch = 'A';
		
		VarDeclarePrint vdObj = new VarDeclarePrint();
		
		vdObj.initialize(i, j, ch);
		vdObj.printVar();
		
	}
}
