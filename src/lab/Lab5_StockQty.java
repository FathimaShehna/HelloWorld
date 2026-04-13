package lab;

public class Lab5_StockQty {

	public static void main(String[] args) {
		
		int[] stockQty = {20, 15, 30, 0, 25};
		int sum =0;
		
		 /*for (int i:stockQty) {  //enhanced for loop
			System.out.println(i);  //prints each item
			} */
		for (int i:stockQty) {
		if (i == 0) {
			System.out.println("Out of stock"); 	
			break;  //skips the rest
		}
		}
		for (int i=0;i<stockQty.length;i++) {
			if(stockQty[i]!=0) {
			sum+=stockQty[i];
			 
			}
			//System.out.println("Total Quantity : " + sum);
			
		}
		System.out.println("Total Quantity : " + sum);
		
		if(sum<50) {
			System.out.println("Low Stock");
		}
		else if ((sum>=50) && (sum<=100)) {
			System.out.println("Moderate Stock");
		}
		else {
			System.out.println("Good Stock");
		}
		
}
}
