package day_4;
import user_ip_day_4.UserInput;
import login_cred_day_4.LoginCred;

public class LocalSchoolValidationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserInput userip = new UserInput();
		LoginCred login  = new LoginCred();
		
		String[] data = userip.enter_input();
		login.check_input(data);

	}

}



//You are helping a small local school design a basic login validation system using simple codes instead of 
//full usernames and passwords.
//Your task is to write a Java program that:
//
//Accept User Input:
//   Ask the user to enter:
//       A username code (a single character: 'A' for admin, 'S' for student, 'G' for guest).
//       A password (integer: 1234 for admin, 1111 for student).
//       A role ID (integer: 1 for admin, 2 for student, 3 for guest).
//   Use the Scanner class to capture these inputs from the console.
//Check Login Credentials:
//      Compare the entered values with the following predefined credentials:
//         Admin: username code = 'A', password = 1234, role ID = 1
//         Student: username code = 'S', password = 1111, role ID = 2
//         Guest: role ID = 3 (username code and password are not checked for guests).
//      Use case-sensitive comparison for the username code and exact matches for password and role ID.
//Display Result:
//      Print "Welcome Admin. Full access granted." if username code is 'A', password is 1234, and role ID 
//      is 1.
//      Print "Welcome Student. Limited access granted." if username code is 'S', password is 1111, and role
//      ID is 2.
//      Print "Welcome Guest. View-only access." if role ID is 3.
//      Print "Invalid credentials or role." for any other combination.





