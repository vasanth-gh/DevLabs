package assignmentOne;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int rVal;
		int max = 100;
		int min = 1;
		
		for(int i=0;i<arr.length;i++) {
			rVal = (int)(Math.random()*(max - min +1) + min);
			arr[i] = rVal;			
		}
		
		System.out.println("Values present in array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");			
		}
		
		Arrays.sort(arr);
		System.out.println("\n\nValues after sorting array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");			
		}
		
		
		
	}
	
}
