package lab;

	abstract class User {                //abstract class
		
		abstract void showMessage();     //abstract method (ie, method without implementation)
		
		public void displayUserType() {  //concrete method (ie, method with implementation)
			
			System.out.println("User type selected");
			}
	}
	
	class AdminUser extends User {       
	
		public void showMessage() {       
			System.out.println("Welcome, Admin!");
			
		}
		
	}
	
	class GuestUser extends User{
	
		public void showMessage() {
			System.out.println("Welcome, Guest!");
			
		}
		
	}
	
	public class UserTest_Lab8 {
	
		public static void main(String[] args) {
			
			AdminUser au = new AdminUser();
			GuestUser gu = new GuestUser();
			
			au.displayUserType();
			au.showMessage();
			
			gu.displayUserType();
			gu.showMessage();
			
	
		}
	
	}
