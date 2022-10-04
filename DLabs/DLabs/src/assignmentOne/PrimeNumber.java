package assignmentOne;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int pNums = 100;
		int flag=0;
		
		for(int i=1;i<=pNums;i++) {
			for(int j=2;j<i/2;j++) {
				if(i%j == 0) {
//					System.out.println(i + " is not a prime number");
					flag = 1;
				}
			}
			if(flag == 0) {
				System.out.println(i + " is a prime number");
			}
			flag=0;
		}
		
	}

}
