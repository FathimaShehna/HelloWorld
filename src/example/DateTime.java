package example;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class DateTime {
	
	  public static void main(String[] args) {
		  
	    LocalDateTime currDateTime = LocalDateTime.now();
	    System.out.println("Before formatting: " + currDateTime);
	    DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = currDateTime.format(formatDateTime);
	    System.out.println("After formatting: " + formattedDate);
	  }
	
}
