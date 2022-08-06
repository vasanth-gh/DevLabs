//LAB1

package rectangle;

public class RectangleMain {
	
	public static void main(String[] args) {
		
		float len = 10.5f;
		float br = 5.8f;
		
		AreaPerimtrRectangle rec = new AreaPerimtrRectangle();
		
		rec.length = len;
		rec.breadth = br;
		
		System.out.println("Length : " + len);
		System.out.println("Breadth : " + br);
		System.out.println("Area of rectangle : " + rec.rectArea());
		System.out.println("Perimeter of rectangle : " + rec.rectPerimeter());
		
		
	}

}
