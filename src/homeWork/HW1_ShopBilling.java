package homeWork;

public class HW1_ShopBilling {

	public static void main(String[] args) {
		
		String itemName = "Soap";
		int qty = 4;
		float unitPrice = 18.75f;
		
		float total = qty * unitPrice;
		
		System.out.println("The Item name is " +itemName );
		System.out.println("Quantity is " +qty );
		System.out.println("Unit Price is " +unitPrice );
		System.out.println("The total price is " +total );

	}

}
