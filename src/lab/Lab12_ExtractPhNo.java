package lab;

import java.util.regex.*;

	
	public class Lab12_ExtractPhNo {
		
		@SuppressWarnings("unchecked")
		
		public static void findNum (String message) {
		
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(message);
		
		//String[] result = pattern.split(message);
		
		//for(String temp : result)
			System.out.println(matcher);	
	
	}
	
		public static void main(String[] args) {
			
			String message = "Hello, My number is 9868567867";
			findNum (message);
		}

	
	}
