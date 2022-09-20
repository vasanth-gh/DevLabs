package lab3_2Overload;

public class MainPerimeterCalc {

	public static void main(String[] args) {
		Perimeter objP = new Perimeter();
		objP.perimeterCalculate(5); //Square perimeter calculation
		objP.perimeterCalculate(4, 5);    //Rectangle Perimeter calculation
		objP.perimeterCalculate(4, 5, 5);    //Triangle Perimeter calculation
	}
	
}
