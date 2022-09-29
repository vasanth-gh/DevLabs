package lab5_PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int fNum;
		int sNum;
		int m;
		int re;
		int flag=0;
		
		Scanner sc = new Scanner(System.in);
		fNum = sc.nextInt();
		sNum = sc.nextInt();
		
		System.out.println("Prime numbers between " + fNum + " and " + sNum + " :");
		
		for (int i=fNum ; i<=sNum ; i++) {
			m = i/2;
			for(int j=2;j<=m;j++) {
				re = i%j;
				if(re==0) {
					flag = 1;
					break;
				}
			}
			if (flag==0) {
			System.out.println(i);
			}else {
				flag = 0;
			}
		}
		
		sc.close();
		
	}

}
