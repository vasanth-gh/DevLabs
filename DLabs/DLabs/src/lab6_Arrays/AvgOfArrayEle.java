package lab6_Arrays;

public class AvgOfArrayEle {
	
	
	public static void main(String[] args) {
		
		int[] a = new int[10];
		int avg = 0;
		float ag;
		
		System.out.println("Size of array (a.length): " + a.length);
		
		for(int i=1;i<a.length;i++) {
			a[i] = i;
		}
		
		System.out.println("Values in array: ");
		for(int i=1;i<a.length;i++) {
			System.out.println(a[i]);
			avg = avg + a[i];
		}
		
		ag = (float) avg/a.length;
		
		System.out.println("Average of elements present in an array : " + ag);
		
	}
	
	

}
