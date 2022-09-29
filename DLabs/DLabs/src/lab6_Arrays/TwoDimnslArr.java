package lab6_Arrays;

public class TwoDimnslArr {
	
	public static void main(String[] args) {
		
		int[][] a = new int[4][6];
		int num;
		int max = 100;
		int min = 10;
		
		System.out.println("Length of an array rows : " + a.length);
		System.out.println("Length of an array col in first row: " + a[0].length);
		System.out.println("Length of an array col in second row: " + a[1].length);
		
//		 int[][] foo = new int[][] {
//		        new int[] { 1, 2, 3 },
//		        new int[] { 1, 2, 3, 4},
//		    };
//
//		    System.out.println(foo.length); //2
//		    System.out.println(foo[0].length); //3
//		    System.out.println(foo[1].length); //4
//		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				num = (int) (Math.random()*(max - min + 1)+min);
				a[i][j] = num;
			}
		}
			
		System.out.println("Values in two dimensional array are :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		
		
	}

}
