package pattern;

public class NumTriangle {
	
	public static void main(String[] args) {
		
		
		int[][] num = new int[4][4];
		int val = 0;
		
		for(int i=1; i<=4; i++) {
			for (int j=1;j<=i;j++ ) {
				num[i-1][j-1]=val;
				val++;
			}
		}
			
		for(int i=1; i<=4; i++) {
			for (int j=1;j<=i;j++ ) {
				System.out.print(num[i-1][j-1]);
			}
			System.out.println("");
		}
		
	}
}
