package day_3;
import greeting_day_3.GreetingDisplay;
import profile_day_3.UserInput;

public class MainProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingDisplay greet = new GreetingDisplay();
		UserInput inp = new UserInput();
		
		String name = inp.input_details();
		greet.display_greeting(name);

	}

}
