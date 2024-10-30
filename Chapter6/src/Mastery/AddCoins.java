package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddCoins {

	//Method
	public static void getDollarAmount(int num1,int num2, int num3, int num4)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		double q = num1 * 0.25;
		
		double d = num2 * 0.1;
		
		double n = num3*0.05;
		
		double p = num4 * 0.01;
		
		double total = q+d+n+p;
		
		System.out.print("Total: $"+df.format(total));
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your total coins: ");
		System.out.println("Quarters: ");
		int q = input.nextInt();
		System.out.println("Dimes: ");
		int d = input.nextInt();
		System.out.println("Nickels: ");
		int n = input.nextInt();
		System.out.println("Pennies: ");
		int p = input.nextInt();
		
		getDollarAmount(q,d,n,p);
	}
}
