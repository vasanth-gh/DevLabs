package assignmentOne;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		int yr;
		
		Scanner sc = new Scanner(System.in);
		yr = sc.nextInt();
		
		if(yr%4 == 0) {
			System.out.println(yr + " - is leap year");
		}else {
			System.out.println(yr + " - is not a leap year");
		}		
	}

}
