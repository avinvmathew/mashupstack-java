//for day 3
package registration;
import java.util.Scanner;

public class WelcomeForm {
	public void register() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name : ");	
		String fname =  input.next();
		System.out.println("Enter your age : ");	
		int age = input.nextInt();
		System.out.println("Hello " + fname + "!\n" + "Your age is : " + age);
	}
}
