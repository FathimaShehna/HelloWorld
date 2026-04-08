package lab;

public class BookStore {

	public static void main(String[] args) {
		
		int qty = 3;
		int pricePerBook = 275;
		double total = (qty * pricePerBook);
		System.out.println("The total amount as double: " + total);
		
		int discount = 10;  
		double disc = discount; //Converting a discount value (e.g., 10% stored as an int) to a double.
		double d=disc/100;
		System.out.println("The Discount to be applied: " + d);
		
		double finalPrice = total - d ; //Final price with discount applied
		System.out.println("The Final Bill with discount: " + finalPrice);
	}

}
