package lab3_1Interface;

public class MainBlock {

	public static void main(String[] args) {
		
		float amt = 10000.0f;
		
		HdfcBank hObj = new HdfcBank(amt,0.06f);
		float hdfcInt = hObj.getInterest();
		
		CbkBank cObj = new CbkBank(amt,0.05f);
		float cbkInt = cObj.getInterest();
		
		System.out.println("One year Interest accumulated in HDFC bank for amount " + amt + " is " + hdfcInt);
		System.out.println("One year Interest accumulated in CBK bank for amount " + amt + " is " + cbkInt);
		
	}
}
