package day_7;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AttendanceSystem {
	
	public static float avgg(int[] arr1) {
		int sum = 0;
		for(int i: arr1) {
			sum = sum + i;
		}
		
		return (sum/arr1.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedData = currDateTime.format(formatDateTime);
		
		System.out.println("Enter number of students : ");
		int nos = input.nextInt();
		
		String[] names = new String[nos];
		int[] marks = new int[nos];
		
		for(int i = 0; i < nos; i++) {
			System.out.println("Enter student name : ");
			names[i] = input.next();
				
			System.out.println("Enter marks : ");
			marks[i] = input.nextInt();
		}
		
		for(int i = 0; i < nos; i++) {
			System.out.println(names[i]);
				
			System.out.println(marks[i]);
			
			if(marks[i] < 35) {
				System.out.println("Needs improvement!!");
			}
		}
		
		System.out.println("Average marks = " + avgg(marks));
		System.out.println("Current date and time : " + formattedData);
	}

}


//You are helping building a small attendance system for a training class. The system should ask the user to 
//enter the number of students and their names and marks.Complete the following tasks:
//Store the data in arrays.
//Display the name and mark of each student.
//If any student has marks below 35, print "Needs Improvement".
//Use a method to calculate and return the average mark.
//Display the current date and time when the program ends.