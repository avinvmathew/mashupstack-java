package day_6;

public class InventoryChecker {
	
	public static void stock_checker(int total_qty) {
		System.out.println("Total quantity = " + total_qty);
		
		if(total_qty > 100) {
				System.out.println("Good stock!");
		}
		else if(total_qty <= 100 && total_qty >= 50 ) {
				System.out.println("Moderate stock!");
		}
		else {
			System.out.println("Low stock!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stock_qtys = {20, 15, 30, 1, 25};
		int total_qty = 0;
		boolean flag = true;
		
		for(int i:stock_qtys) {
			if(i==0) {
				System.out.println("Out of stock!");
				flag = false;
				break;
			}
			else {
				total_qty += i;
			}
		}
		if(flag) {
			stock_checker(total_qty);
		}
		
	}

}




//You are working on a basic inventory checker. The task is to:
//
//Store the stock quantities for 5 items in a array (e.g., [20, 15, 30, 0, 25]).
//Check each item one by one using a loop.
//If any item has a quantity of 0, display "Out of stock" and skip checking the rest.
//If all items are in stock (none are 0), calculate and display the total quantity and whether the stock is 
//"Low", "Moderate", or "Good" based on total quantity:
//Below 50 -> "Low Stock"
//50–100 -> "Moderate Stock"
//Above 100 -> "Good Stock"

