package homeWork;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HW6_Grocerystore {
	public static double finalCost(int total) {
		int discount = 10;
		double disc = discount;
		double d = disc/100;
		double t = total;  //total is int but return type double
		double finalCost = t - d;
		return finalCost;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
		int [] prices = {50, 40, 100, 25, 30};
		
		int qty[] = new int[items.length]; //storing quantities in array according to items length
		int total=0;
		
		System.out.println("Available items are :");
		for(int i=0;i<items.length;i++) {
			System.out.println(items[i] + "-" + prices[i]); //printing each items and its prices
		}
		
		
			try { //handling exception if a string is passed instead of qty
				
				for(int i=0; i<items.length;i++) {
					
			System.out.println("Enter the Quantity you want for " +items[i]+ ":"); //asking qty for each items
			qty[i] = sc.nextInt();
			sc.nextLine();
			
			total+= qty[i]*prices[i];
				}
			}
			
			catch(Exception e) {
				System.out.println("Something went wrong.");
			}

		System.out.println("Total cost : " + total);
		
		if(total>500) {
			double p=finalCost(total);   //passing total as the parameter and converting it to double and storing the value in p
			System.out.println("Final Price after discount : " + p);
		}
		
		LocalDateTime myDateObj = LocalDateTime.now();    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);  
	    System.out.println("Date & Time of purchase: " + formattedDate);
		}

}
