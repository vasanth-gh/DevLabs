package lab7_BblSort;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		String[] arr = {"bmw","audi","lexus","mustang","merc"};
		String[] arrEnt = new String[5];
		
		BubbleSort bs = new BubbleSort();
		
		bs.asgnVal(arr);
		bs.bubbSort();
		
		System.out.println("\n-------------Taking Value from User------------");
		System.out.println("Please enter five string for sorting using bubble sort :");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arrEnt.length;i++) {
			System.out.print((i+1) + "->");
			arrEnt[i] = sc.nextLine();
			System.out.println("");
		}
		sc.close();
		
		BubbleSort bsM = new BubbleSort();
		
		bsM.asgnVal(arrEnt);
		bsM.bubbSort();
		
		
	}
}
