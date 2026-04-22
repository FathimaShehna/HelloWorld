package homeWork;

import java.util.Scanner;

public class HW5_GradeReport {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
		int total = 0;
		boolean isFail = false;
		
		System.out.println("Enter marks for 5 subjects:");
		
		for (int i=0;i<marks.length;i++) {
			
			marks[i] = sc.nextInt();
			//total+=marks[i];
			if (marks[i] < 35) {
				//System.out.println("Fail");
				isFail=true;
	            break; 
	        }
			total+=marks[i];
		}
		
		
		if(isFail) {
			System.out.println("Fail");
		}
		else {
			
			System.out.println("Total marks obtained : " +total);
			
			double avg;
			avg = total/marks.length;	
			
		System.out.println("Average marks : " +avg);
			
		if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 75) {
            System.out.println("Grade: B");
        } else if (avg >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
		}
		sc.close();

	}

}
