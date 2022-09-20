package lab3_2Overload;

public class Perimeter {
	
//	Triangle perimeter P = a + b + c
	public void perimeterCalculate(int a, int b, int c) {
		int p = a + b + c;
		System.out.println("Perimeter of a triangle : " + p);
	}
	
	
//	Rectangle perimeter P=2(l+w)
	public void perimeterCalculate(int l, int w) {
		int p = 2 * (l+w);
		System.out.println("Perimeter of a Rectangle : " + p);
	}

//	Square perimeter P=4a
	public void perimeterCalculate(int a) {
		int p = 4 * a;
		System.out.println("Perimeter of a Square : " + p);
	}

}
