package lab3_1Interface;

public class HdfcBank implements Bank{
	
	float amt;
	float rate;
	
	public HdfcBank(float amt, float rate) {
		this.amt = amt;
		this.rate = rate;
	}
	
	public float getInterest() {
		return amt*rate;
	}
}
