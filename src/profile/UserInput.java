package profile;

import java.util.Scanner;

public class UserInput {

	public String userMethod(String[] args) {
		Scanner nameInput = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = nameInput.nextLine();   //String inputs
		return name;  //returns the input
	}

}
