package lab3_1Interface;

public class CbkBank implements Bank{

		float amt;
		float rate;
		
		public CbkBank(float amt, float rate) {
			this.amt = amt;
			this.rate = rate;
		}
		
		public float getInterest() {
			return amt*rate;
		}
	
}
