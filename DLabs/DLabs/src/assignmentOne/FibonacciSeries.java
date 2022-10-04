package assignmentOne;

public class FibonacciSeries {
	
	int totalVal;
	int a;
	int b;
	int c;
	
	public FibonacciSeries(int n) {
		this.totalVal = n;
	}
	
	public void printFBSeries() {
		
		a = 0;
		b = 1;
		c = 0;
		System.out.print(a + " " + b);
		
		for(int i = 2; i<totalVal ; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			
		}
		
	}
	
//	using recursive function
	static int num1 = 0;
	static int num2 = 1;
	static int num3 = 0;
	public static void printFBSeriesRec(int cnt) {
		if (cnt > 0) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(" " + num3);
			cnt = cnt-1;
			printFBSeriesRec(cnt);
		}		
	}

	
	public static void main(String[] args) {
		int totalVal = 11;
		
		FibonacciSeries fbs = new FibonacciSeries(totalVal);
		fbs.printFBSeries();
		
		//Printing using recursive function
		System.out.println("\n\nPrinting using recursive function");
		System.out.print(num1 + " " + num2);
		FibonacciSeries.printFBSeriesRec(totalVal-2);
		
		
	}

}
