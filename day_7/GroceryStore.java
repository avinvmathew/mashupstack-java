package day_7;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GroceryStore {
	
	public static float discounter(int total) {
		
		if(total > 500) {
			total = total - ((10/100) * total);
			System.out.println("Discount applied!!!");
		}
		
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedData = currDateTime.format(formatDateTime);
		
		String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
		int[] prices = {50, 40, 100, 25, 30};
		
		int no_of_items = items.length;
		
		System.out.println("Items	 |	Price");
		System.out.println("---------------------");
		for(int i = 0; i < no_of_items; i++) {
			System.out.println(items[i] + "	 |	" + prices[i]);
		}
		
		int total = 0;
		int qty = 0;
		for(int i = 0; i < no_of_items; i++) {
			System.out.println("Enter quantity of " + items[i] + " : ");
			try {
				qty = input.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Enter a number as quantity");
				break;
			}
			finally {
				total = total + (qty * prices[i]);
			}
		}

		System.out.println("Total cost = " + discounter(total));
		System.out.println("Current date and time : " + formattedData);
	}

}


//You are helping a shopkeeper manage a small grocery store. The store sells five items: Rice, Sugar, Oil, Soap, and Milk. Each item has a fixed price.
//The shopkeeper wants a program that:
//Use the following data for items and prices:
//   Items: ["Rice", "Sugar", "Oil", "Soap", "Milk"]
//   Prices per unit (in Rs): [50, 40, 100, 25, 30]
//Shows a list of available items and asks the user to enter the quantity (in units) they want for each item.
//Calculates and displays the total cost.
//If the total cost is more than Rs.500, apply a 10% discount.
//Use a method to calculate the total and return the final amount after discount (if applicable).
//Display the current date and time of the purchase.
//Use try-catch to handle any input errors (like typing a string instead of a number).