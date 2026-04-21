package homeWork;

class Course {
		String courseName;
		int duration;
		int stuNo;
		
		static int stuCount=0;
		
		Course(String courseName, int duration, int stuNo){
			this.courseName=courseName;
			this.duration=duration;
			this.stuNo=stuNo;
			stuCount+=stuNo;
		}
		
		
		final String courseCreator = "CodeMentor Academy";
		
		class Platform{
			public void msg() {
				System.out.println("Courses are hosted on CodeMentor");
			}
		}
		
		public void displayInfo() {
			System.out.println("The course name is : "+courseName);
			System.out.println("The duration of the course is : "+duration);
			System.out.println("No: of students : "+stuNo);
			System.out.println("Creator : "+courseCreator);
		}
	}
	
	public class CourseTest {
	
		public static void main(String[] args) {
			
			Course c1 = new Course("Java",6,2);
			Course c2 = new Course("Python",4,1);
			
			c1.displayInfo();
			System.out.println();
			c2.displayInfo();
			System.out.println();
			
			System.out.println("Total no: of Students  : "+Course.stuCount);
		}
	
	}
