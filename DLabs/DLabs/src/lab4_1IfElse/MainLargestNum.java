package lab4_1IfElse;

public class MainLargestNum {

	public static void main(String[] args) {
		int a=70;
		int b=40;
		int c=30;
		int lNum;
		
		LargestOfThreeNums objL = new LargestOfThreeNums();
		lNum = objL.largestNum(a, b, c);
		System.out.println("Largest number of "+ a + ", " + b + " and " + c + " is : " + lNum );
		
		
	}
	
}
