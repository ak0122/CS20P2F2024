package Skillbuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i, num, sum=0, oddnum;
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		input.close();
		
		for(i=1;i<=num;i+=2)
		{
			sum+=i;
		}
		System.out.print("The sum of odds is: "+sum);
}
}
