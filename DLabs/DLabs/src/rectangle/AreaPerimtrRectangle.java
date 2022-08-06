package rectangle;

public class AreaPerimtrRectangle {

	float length;
	float breadth;
	
	public float rectArea() {
		return length*breadth;
	}
	
	public float rectPerimeter() {
		return 2*(length+breadth);
	}
	
}
