package retailDiscount;

public class DiscountItems {
	
	int itemPrice;
	
	int itemQty;
	
	public int amount() {
		return itemPrice*itemQty;
	}	

}
