package homeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW12_ContactFormChecker {
	
	public static boolean isValidName(String name) {
		
	//	Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]*");
	//	Matcher matcher = pattern.matcher(name);
	//	return matcher.find();                         //cant use matcher.find(); since it checks if any part of the string matches the pattern — not the whole string. 
		return name.matches("[A-Z][a-zA-Z]*");         //so this is used
	}
	
	public static boolean isValidEmail (String email) {
		
		if (email.startsWith("@") || email.endsWith("@") ||
	            email.startsWith(".") || email.endsWith(".")) {
	            return false;
	        }
	        return email.contains("@") && email.contains(".");
	}
	
	public static boolean isValidPhNo (String phone) {
		
		Pattern pattern = Pattern.compile("\\d{10}");
		Matcher matcher = pattern.matcher(phone);
		return matcher.find();
		
	}

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		    System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();

	        System.out.print("Enter Phone Number: ");
	        String phone = sc.nextLine();
	        
	        if(isValidName(name)) {
	        	System.out.println("Name is valid");
	        }
	        else {
	        	System.out.println("Name is not valid");
	        }
	        
	        if(isValidEmail(email)) {
	        	System.out.println("Email is valid");
	        }
	        else {
	        	System.out.println("Email is not valid");
	        }
	        
	        if(isValidPhNo(phone)) {
	        	System.out.println("Phone number is valid");
	        }
	        else {
	        	System.out.println("Phone number is not valid");
	        }
	        
	        sc.close();
	     
	}

}
