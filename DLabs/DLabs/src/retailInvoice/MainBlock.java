package retailInvoice;

public class MainBlock {
	
	public static void main (String[] args) {
		
		String invoiceNo = "New101";
		int itemNo = 123456;
		double itemPrice = 200.15d;
		int itemQty = 2;
		String discount = "5%";
		double amount = 998.25;
		String comments = "Happy Shopping";		
		
		StoreInvoice inv = new StoreInvoice();
		
		inv.setInvoiceNo(invoiceNo);
		System.out.println("Invoice No. : " + inv.getInvoiceNo());
		
		inv.setItemNo(itemNo);
		System.out.println("Item No. : " + inv.getItemNo());
		
		inv.setItemPrice(itemPrice);
		System.out.println("Item Price : " + inv.getItemPrice());
		
		inv.setItemQty(itemQty);
		System.out.println("Item Quantity : " + inv.getItemQty());
		
		inv.setDiscount(discount);
		System.out.println("Discount : " + inv.getDiscount());
		
		inv.setAmount(amount);
		System.out.println("Amount : " + inv.getAmount());
		
		inv.setComments(comments);
		System.out.println("Comments : " + inv.getComments());
		
	}

}
