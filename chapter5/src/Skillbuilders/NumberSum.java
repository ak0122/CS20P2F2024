package Skillbuilders;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int i, num, sum;
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		input.close();
		
		for(i=1;i<=num;i++)
		{
			System.out.println(i);	
		}
		sum = (int)(0.5*num*(num+1));
		System.out.println("The Sum is: "+sum);
	}
}
