/*

Program: AddCoins.java          Last Date of this Revision: October 30, 2024

Purpose: An application that calculates the total amount of cash you have in coins.

Author: Aryan Kapoor, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddCoins {

	//Method to find total amount in dollars.
	//It takes in four parameters, 1 for each coin type.
	public static void getDollarAmount(int num1,int num2, int num3, int num4)
	{
		//ensure the total money is always given to 2 dec places.
		DecimalFormat df = new DecimalFormat("0.00");
		//Use the respective values in dollars for each coin
		double q = num1 * 0.25;
		
		double d = num2 * 0.1;
		
		double n = num3*0.05;
		
		double p = num4 * 0.01;
		
		double total = q+d+n+p;
		
		System.out.print("Total: $"+df.format(total));
	}
	//Get total no. of each type of coin held by user.
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your total coins: ");
		System.out.print("Quarters: ");
		int q = input.nextInt();
		System.out.print("Dimes: ");
		int d = input.nextInt();
		System.out.print("Nickels: ");
		int n = input.nextInt();
		System.out.print("Pennies: ");
		int p = input.nextInt();
		
		input.close();
		
		//find value in dollars of the 4 variables by calling method.
		getDollarAmount(q,d,n,p);
	}
}
/* Screen Dump

Case 1:
Enter your total coins: 
Quarters: 5
Dimes: 6
Nickels: 5
Pennies: 1
Total: $2.11
 
Case 2:
Enter your total coins: 
Quarters: 2
Dimes: 3
Nickels: 4
Pennies: 5
Total: $1.05
 */


