package lab;

import java.util.regex.*;

	
	public class Lab12_ExtractPhNo {
		
		@SuppressWarnings("unchecked")
		
		public static void findNum (String message) {
		
		Pattern pattern = Pattern.compile("\\d{10}");
		Matcher matcher = pattern.matcher(message);
		
		boolean found =false;
		
		while(matcher.find()) {
			 System.out.println(matcher.group());
	            found = true;
		}
		
		if(!found) {
			System.out.println("Matcher not found");
		}
	
	}
		
	
		public static void main(String[] args) {
			
			String message = "Hello, My number is 9868567867 or 8796567890";
			findNum (message);
		}

	
	}
