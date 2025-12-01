package login_cred_day_4;

public class LoginCred {
	public void check_input(String[] data) {
		if((data[0].equals("A")) && (data[1].equals("1234")) && (data[2].equals("1"))) {
			System.out.println("Welcome Admin. Full access granted.");
		}
		else if((data[0].equals("S")) && (data[1].equals("1111")) && (data[2].equals("2"))) {
			System.out.println("Welcome Student. Limited access granted.");
				}
		else if(data[2].equals("3")) {
			System.out.println("Welcome Guest. View-only access.");
		}
		else {
			System.out.println("Invalid credentials or role.");
		}
	}
}






//Check Login Credentials:
//Compare the entered values with the following predefined credentials:
// Admin: username code = 'A', password = 1234, role ID = 1
// Student: username code = 'S', password = 1111, role ID = 2
// Guest: role ID = 3 (username code and password are not checked for guests).
//Use case-sensitive comparison for the username code and exact matches for password and role ID.

//Display Result:
//Print "Welcome Admin. Full access granted." if username code is 'A', password is 1234, and role ID 
//is 1.
//Print "Welcome Student. Limited access granted." if username code is 'S', password is 1111, and role
//ID is 2.
//Print "Welcome Guest. View-only access." if role ID is 3.
//Print "Invalid credentials or role." for any other combination.