package quoRemDivision;

public class QuoRemainder {

	int quo;
	int rem;
	int divisor;
	int dividend;
	
	public int findQuotient() {
		quo = dividend / divisor;
		return quo;
	}
	
	public int findRemainder() {
		rem = dividend % divisor;
		return rem;
	}
}
