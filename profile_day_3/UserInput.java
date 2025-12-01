package profile_day_3;
import java.util.Scanner;

public class UserInput {
	public String input_details() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name : ");	
		String name =  input.nextLine();
		
		return name;
	}
}
