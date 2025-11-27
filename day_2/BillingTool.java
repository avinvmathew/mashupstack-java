package day_2;

public class BillingTool {
	String itemName = "Soap";
	int quantity = 4;
	double unitPrice = 18.75;
	
	double totalCost = quantity * unitPrice;
	
	public static void main(String[] args) {
		
		BillingTool obj1 = new BillingTool();
		
		System.out.println("Item name: " + obj1.itemName);
		System.out.println("Quantity: " + obj1.quantity);
		System.out.println("Unit price: " + obj1.unitPrice);
		System.out.println("Total cost : " + obj1.totalCost);
		
	}
}

//You’re helping build a simple billing tool for a small shop. The tool should use predefined values to 
//simulate billing a single item.
//
//Create a Java program that:
//Stores the following information in variables:
//Item name: "Soap"
//Quantity: 4
//Unit price: 18.75
//Calculates the total cost by multiplying quantity with unit price.
//Displays the item name, quantity, unit price, and total cost.