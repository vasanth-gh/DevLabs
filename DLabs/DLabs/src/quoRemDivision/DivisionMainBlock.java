//LAB3

package quoRemDivision;

public class DivisionMainBlock {

	public static void main(String[] args) {
		
		QuoRemainder qr = new QuoRemainder();
		qr.dividend = 100;
		qr.divisor = 21;
		
		System.out.println("Dividend : " + qr.dividend);
		System.out.println("Divisor : " + qr.divisor);
		System.out.println("Quotient : " + qr.findQuotient());
		System.out.println("Remainder : " + qr.findRemainder());
		
	}
}
