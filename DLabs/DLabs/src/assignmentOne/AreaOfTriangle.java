package assignmentOne;

import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main(String[] args) {
		
		int b;
		int h;
		float area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value for triangle base : ");
		b = sc.nextInt();
		System.out.println("Please enter value for triangle hight : ");
		h = sc.nextInt();
		area = (float)(0.5*b*h);
		System.out.println("Area of triangle is : " + area);
		
		}

}
