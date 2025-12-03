package day_6;

public class GradeReport {

	public static void grade_checker(int total_marks) {
		System.out.println("Total marks = " + total_marks);
		float average_marks = total_marks/5;
		System.out.println("Average marks = " + average_marks);
		
		if(average_marks >= 90) {
			System.out.println("Grade: A");
		}
		else if(average_marks <= 89 && average_marks >= 75 ) {
			System.out.println("Grade: B");
		}
		else if(average_marks <= 74 && average_marks >= 60 ) {
			System.out.println("Grade: C");
		}
		else {
			System.out.println("Grade: D");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grade_report = {78, 82, 91, 65, 38};
		int total_marks = 0;
		boolean flag = true;
		
		for(int i:grade_report) {
			if(i<35) {
				System.out.println("Fail!");
				flag = false;
				break;
			}
			else {
				total_marks += i;
			}
		}
		if(flag) {
			grade_checker(total_marks);
		}
		
	}

}


//You are building a simple grade report for a school. The teacher wants a program that:
//Stores the marks of 5 subjects in a array (e.g.,{78, 82, 91, 65, 34}).
//Calculates the total and average marks.
//Displays the result using the following conditions:
//If average is 90 or above -> "Grade: A"
//If average is 75–89 -> "Grade: B"
//If average is 60–74 -> "Grade: C"
//If average is below 60 -> "Grade: D"
//If the student scored below 35 in any subject, the result should be "Fail" immediately (use a loop and break).