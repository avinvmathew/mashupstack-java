package user_ip_day_4;
import java.util.Scanner;

public class UserInput {
	public String[] enter_input() {
		
		Scanner input = new Scanner(System.in);
		
		String[] data = new String[3];
		
		System.out.println("Enter a username code (a single character: 'A' for admin, 'S' for student, 'G' for guest) : ");
		data[0] = input.next();
		System.out.println("Enter password (integer: 1234 for admin, 1111 for student) : ");
		data[1] = input.next();
		System.out.println("A role ID (integer: 1 for admin, 2 for student, 3 for guest) : ");
		data[2] = input.next();
		
		return data;
	}
}
