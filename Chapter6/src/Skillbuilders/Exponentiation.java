package Skillbuilders;

import java.util.Scanner;

public class Exponentiation {

	public static void powerOf(int base,int exp)
	{
		int ans=1;
		for (int i=1; i<=exp; i++)
		{
			ans = ans*base;
		}
		System.out.print(ans);
	}
	
	public static void main(String[] args)
	{
		int base,exp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the base: ");
		base = input.nextInt();
		
		System.out.print("Please enter the exponent: ");
		exp = input.nextInt();
		
		powerOf(base,exp);
		
		input.close();
		
	}
}
