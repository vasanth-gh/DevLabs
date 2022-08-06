package retailDiscount;

public class MainBlockDiscount {
	
	public static void main(String[] args) {
		
		float percDiscount = 0.15f;
		float servTax = 0.02f;
		int amt;
		float discAmt;
		float finalAmount;
		
		DiscountItems itemA = new DiscountItems();
		itemA.itemPrice = 200;
		itemA.itemQty = 3;		
		
		DiscountItems itemB = new DiscountItems();
		itemB.itemPrice = 80;
		itemB.itemQty = 5;
		
		DiscountItems itemC = new DiscountItems();
		itemC.itemPrice = 150;
		itemC.itemQty = 2;
		
		amt = itemA.amount() + itemB.amount() + itemC.amount();
		
		discAmt = amt - (amt*percDiscount);
		
		finalAmount = discAmt + (discAmt*servTax);
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Items           Price              Qty");
		System.out.println("-------------------------------------------");
		System.out.println("ItemA           " + itemA.itemPrice + "                " + itemA.itemQty);
		System.out.println("ItemB           " + itemB.itemPrice + "                 " + itemB.itemQty);
		System.out.println("ItemC           " + itemC.itemPrice + "                " + itemC.itemQty);
		System.out.println("-------------------------------------------");
		
		System.out.println("Total Amount : " + amt);
		System.out.println("Total Amount after 15% discount : " + discAmt);
		System.out.println("Final Amount after 2% ST : " + finalAmount);		
		
	}

}
