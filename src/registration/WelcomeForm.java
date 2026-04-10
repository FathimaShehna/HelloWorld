package registration;

import java.util.Scanner;

public class WelcomeForm {

	public static void main(String[] args) {
		Scanner nameInput = new Scanner(System.in);
		Scanner ageInput = new Scanner(System.in);  //Used for accepting input values
		
		System.out.println("Enter your First name");
		String name = nameInput.nextLine();   //String inputs
		System.out.println("Enter your Age");
		int age = ageInput.nextInt();   //Integer inputs
		
		System.out.println("Welcome " + name + " to MashupStack. Your age is " + age);  //Prints the welcome message with the user inputs
		
		nameInput.close();
		ageInput.close();
		
	}

}
