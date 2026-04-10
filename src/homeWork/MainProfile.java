package homeWork;

import java.util.Scanner;
import profile.UserInput;
import greeting.GreetingDisplay;

public class MainProfile {

	public static void main(String[] args) {
		UserInput a = new UserInput();
		GreetingDisplay b = new GreetingDisplay();  //creating objects from both package classes
		
		
		String exp =a.userMethod(args); //calls the method from UserInput class and accepts the input and the input is stored in a variable called exp
	//System.out.println(exp);
		b.greetingMethod(exp); //the arguments contains the user input

	}

}
