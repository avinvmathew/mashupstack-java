package day_2;

public class BookStore {
	
	int no_of_books = 3;
	int price_per_book = 275;
	int discount_value = 10;
	
	double total = no_of_books * price_per_book;
	
	double conv_discount_value = discount_value;
	
	double discount_price = total - (3 * (total * (conv_discount_value/100)));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore obj1 = new BookStore();
		System.out.println("Discounted price of book = " + obj1.discount_price);
		System.out.println("\n\nNumber of books = " + obj1.no_of_books);
		System.out.println("\nPrice per book = " + obj1.price_per_book);
		System.out.println("\nDiscount value for 1 book = " + obj1.discount_price + "%");
		System.out.println("\nTotal price without discount = " + obj1.total);
		System.out.println("\nConverted discount value = " + obj1.conv_discount_value);
	}

}



//A bookstore wants to calculate the total value of a book order. Each book costs 275 (in whole numbers), 
//and the customer orders 3 books. The store wants the total price to be stored as a decimal 
//(even if the result has no decimal portion). Also, they want to include the discount percentage 
//as a decimal, but it's originally given as an integer.
//
//Your task is to:
//Store the number of books (3) and the price per book (275) as integers.
//Use type casting to:
//Store the total amount (price × quantity) as a double.
//Convert a discount value (e.g., 10% stored as an int) to a double.
//Apply the discount and print the final bill amount.
//Display all the values neatly.