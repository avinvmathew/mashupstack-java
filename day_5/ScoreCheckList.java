package day_5;

public class ScoreCheckList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = {50,60,70,80,95};
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>=90) {
				System.out.println("Excellent");
			}
			else if(scores[i] <= 89 && scores[i]>=75) {
				System.out.println("Good");
			}
			else if(scores[i] <= 74 && scores[i]>=50) {
				System.out.println("Average");
			}
			else if(scores[i]<50) {
				System.out.println("FAIL");
			}
		}
	}
	
}



//You are creating a basic score-checking system for a training program. You are given a list of 5 student 
//scores.
//Write a Java program that:
//Stores the 5 scores in a single-dimension array.
//Checks each score:
//If the score is above or equal to 90, print "Excellent".
//If the score is between 75 and 89, print "Good".
//If the score is between 50 and 74, print "Average".
//If the score is below 50, print "Fail".