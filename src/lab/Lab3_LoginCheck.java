package lab;

import java.util.Scanner;


public class Lab3_LoginCheck {

	public static void main(String[] args) {
		
		String defUserName = "admin";
		String defPassword = "java123";
		
		Scanner nameInp = new Scanner(System.in);
		Scanner passwrdInp = new Scanner(System.in);
		
		System.out.println("Enter your User Name :");
		String name = nameInp.nextLine();
		
		System.out.println("Enter your Password :");
		String passwrd = passwrdInp.nextLine();
		
		if((name.equals(defUserName)) && (passwrd.equals(defPassword))) {
			System.out.println("Login Successful");
		}
		else if((name.equals(defUserName)) || (passwrd.equals(defPassword))){
			System.out.println("Access Denied");
		}
	}

}
