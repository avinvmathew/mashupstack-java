package day_4;
import java.util.Scanner;

public class LoginCheck {
	
	static String savedUsername = "admin";
	static String savedPassword = "java123";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your username : ");
		String uname = input.next();
		
		System.out.println("Enter your password : ");
		String pwd = input.next();
		
		if((uname.equals(savedUsername)) && (pwd.equals(savedPassword))) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Access Denied!");
		}
		
	}

}
