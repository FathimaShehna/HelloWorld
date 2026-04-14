package lab;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lab6_AttendanceSys {
	
	public static double avgMark (int[] marks) {
		int sum=0;
		for (int i =0; i<marks.length ;i++) {
			sum+=marks[i];
		}
		return sum/marks.length;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: of Students");
		int number = sc.nextInt();
		
		String[] names = new String [number];  //to store names in an array according to the no: of students
		int [] marks = new int [number];  //to store marks in an array according to the no: of students
		sc.nextLine();
		
		
		for (int i =0; i<number ;i++)  //iterating according to the input number of students
		{
			System.out.println("Enter the name of the Students");
			names[i]= sc.nextLine();
			
			System.out.println("Enter the marks of the Students");
			marks[i]= sc.nextInt();
			sc.nextLine();
			}
		
		System.out.println("Details of the students are : ");
		
		for (int i =0; i<number ;i++) {
			System.out.println("Name : " +names[i]);
			System.out.println("Marks : " +marks[i]);
			if(marks[i]<35) {
				System.out.println("Needs Improvement");
			}
		}
		
		double avg =avgMark(marks);
		System.out.println("Average Mark : " + avg);
		
		LocalDateTime myDateObj = LocalDateTime.now();    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);  
	    System.out.println("Date & Time: " + formattedDate);  
		
		}
	
		

}
