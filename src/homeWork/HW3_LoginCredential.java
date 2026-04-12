package homeWork;

import java.util.Scanner;

public class HW3_LoginCredential {

	public static void main(String[] args) {
		
		char admUserCode = 'A';
		int admPassword = 1234;
		int admRoleId = 1;
		
		char stuUserCode = 'S';
		int stuPassword = 1111;
		int stuRoleId = 2;
		
		//char guestUserCode = 'G';
		int guestRoleId = 3;
		
		Scanner userCodeInp = new Scanner(System.in);
		Scanner passwrdInp = new Scanner(System.in);
		Scanner roleIdInp = new Scanner(System.in);
		
		System.out.println("Enter your Role ID :");
		int roleId = roleIdInp.nextInt();
		
		if((roleId == guestRoleId)){
			System.out.println("Welcome Guest. View-only access.");
		}
		
		System.out.println("Enter the User Code :");
		char userCode = userCodeInp.next().charAt(0);
		
		System.out.println("Enter your Password :");
		int passwrd = passwrdInp.nextInt();
		
		if((userCode == admUserCode) && (passwrd == admPassword) && (roleId == admRoleId)) {
			System.out.println("Welcome Admin. Full access granted.");
		}
		else if((userCode == stuUserCode) && (passwrd == stuPassword) && (roleId == stuRoleId)){
			System.out.println("Welcome Student. Limited access granted.");
		}
		else {
			System.out.println("Invalid credentials or role.");
		} 
	}
}


