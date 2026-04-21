package lab;

	class Course{
		
		String courseName;
		int duration;
		static int countCourse=0;    //Track how many courses have been created using a static variable.
		
		Course(){                   //constructor
			
			this.courseName="java";    //default constructor that sets default values for course name and duration.
			this.duration=6;
			countCourse++;  
		}
		
		Course(String courseName,int duration){    //parameterized constructor
			this.courseName = courseName;         //constructor that allows setting the course name and duration while creating the object.
			this.duration = duration;
			countCourse++;
		}
		
		final String TrainingCentre = "MashupStack";    // final variable in the class that stores the training center name.
		
		class CourseMaterial{            //inner class
			public void mtrl() {
				System.out.println("Materials provided for this course.");			}
		}
		
		public void displayInfo() {
			System.out.println("The course name is : "+courseName);
			System.out.println("The duration of the course is : "+duration);
			System.out.println("The training centre is : "+TrainingCentre);
		}
		
		
	}
	
	public class Lab10_CourseInfo {
	
		public static void main(String[] args) {
			
			Course c1 = new Course();
			Course c2 = new Course("Python",4);
			
			c1.displayInfo();
			Course.CourseMaterial material = c1.new CourseMaterial();    //inner class object creation using outer class
			material.mtrl();
			System.out.println();
			
			c2.displayInfo();
			Course.CourseMaterial material2 = c2.new CourseMaterial();
			material2.mtrl();
			System.out.println();
			
			System.out.println("Total courses : "+Course.countCourse);
		}
	
	}
