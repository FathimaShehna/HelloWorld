package lab;

public class Lab4_ScoreChecking {

	public static void main(String[] args) {
		int[] score = new int [5];
		score[0] = 0;
		score[1] = 73;
		score[2] = 89;
		score[3] = 49;
		score[4] = 90;
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]); 
			}
		
		for(int i=0;i<score.length;i++) {
			if(score[i]>=90) {
				System.out.println("Excellent");
			}
			else if(score[i]>=75 && score[i]<=89) {
				System.out.println("Good");
			}
			else if(score[i]>=50 && score[i]<=74) {
				System.out.println("Average");
			}
			else if(score[i]<50) {
				System.out.println("Fail");
			}
		}
	}

}
