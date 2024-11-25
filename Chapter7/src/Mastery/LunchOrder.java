	package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LunchOrders {

	    public static void main(String[] args) {
	    	
	    	DecimalFormat df = new DecimalFormat("0.00");
	        Scanner input = new Scanner(System.in);

	        // Create Food objects based on the provided chart
	        Food hb = new Food("hamburger",1.85, 9, 33, 1);
	        Food sa = new Food("salad",2.00, 1, 11, 5);
	        Food f = new Food("fries",1.30, 11, 36, 4);
	        Food so = new Food("soda",0.95, 0, 38, 0);

	        // Prompt user for quantities of each item and display nutritional values
	        System.out.print("Enter the number of hamburgers: ");
	        int numHamburgers = input.nextInt();
	        System.out.println(hb.toString());

	        System.out.print("\nEnter the number of salads: ");
	        int numSalads = input.nextInt();
	        System.out.println(sa.toString());
	        
	        System.out.print("\nEnter the number of french fries: ");
	        int numFries = input.nextInt();
	        System.out.println(f.toString());
	        
	        System.out.print("\nEnter the number of sodas: ");
	        int numSodas = input.nextInt();
	        System.out.println(so.toString());
	        
	        input.close();
	        
	        // Calculate total price
	        double totalPrice = (numHamburgers * hb.getPrice()) +
	                            (numSalads * sa.getPrice()) +
	                            (numFries * f.getPrice()) +
	                            (numSodas * so.getPrice());
	        
	        //Print total price
	        System.out.print("\nYour order comes to: $" + df.format(totalPrice));

	        /* Test Cases 1
	         *  
	         * Enter the number of hamburgers: 
			   5
 			   Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber
 			   
			   Enter the number of salads: 2
			   Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber
			   
			   Enter the number of french fries: 
			   5
			   Each fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber
			   
			   Enter the number of sodas: 
			   6
			   Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber
			   
			   Your order comes to: $25.45 
	           *
	           *
	           *Test Case 2:
				Enter the number of hamburgers: 5
				Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber
				
				Enter the number of salads: 6
				Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber
				
				Enter the number of french fries: 7
				Each fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber
				
				Enter the number of sodas: 8
				Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber
				
				Your order comes to: $37.95 
	         */
	    }
}