package day_5;
import java.util.Scanner;

public class StoreProductTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[][] data = new int[5][3];
		for(int i = 0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Enter day "+ (i+1) + ", Product "+ (j+1)+ " : ");
				data[i][j] = input.nextInt();
			}
		}
		
		int[] totals = {data[0][0] + data[1][0] + data[2][0], data[0][1] + data[1][1] + data[2][1], data[0][2] + data[1][2] + data[2][2]};
		
		for(int i=0;i<totals.length;i++) {
			System.out.println("Total weekly sales of product " + (i+1) + " = " + totals[i]);
			if(totals[i] >= 500) {
				System.out.println("Target Acheived");
			}
			else if(totals[i]<=499 && totals[i] >=300) {
				System.out.println("Average Performance");
			}
			else if(totals[i] < 300) {
				System.out.println("Needs Improvement");
			}
		}
	}

}







//You are helping a store manager track the daily sales of 3 products for 5 days. Each product’s sales are 
//recorded daily.
//Write a Java program that:
//Stores the sales data in a 2D array (5 rows for days and 3 columns for products).
//Calculates the total weekly sales for each product.
//Checks and prints a message for each product:
//If the total sales are more than or equal to 500, print "Target Achieved"
//If between 300 and 499, print "Average Performance"
//If less than 300, print "Needs Improvement"
//The output should display the total sales and the message for each product.