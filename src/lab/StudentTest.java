package lab;

class Student {
	
	private String name;              //declared as private variables
	private int rollNo;
	private double percentage;
	
	public String getName() {        //getter methods
		return name;
	}
	
	public void setName(String name) {
	    this.name = name;                 //used this keyword
	  }
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {          //setter method
	    this.rollNo = rollNo;
	  }
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
	    this.percentage = percentage;
	  }
	
}

public class StudentTest {

	public static void main(String[] args) {
		
		Student s = new Student();           //object created
		s.setName("Tom");                    //set values 
		s.setRollNo(2);
		s.setPercentage(60.7);
		
		System.out.println(s.getName());
		System.out.println(s.getRollNo());
		System.out.println(s.getPercentage());
	}

}
