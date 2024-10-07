package Mastery;

import java.util.*;

public class PrimeNumberA {

	public static void main(String[] args)
	{
		//Declaration
		int num,remainder=1,i=1;
		
		Scanner UserInput = new Scanner(System.in);
		
		System.out.print("Please Enter a Number: ");
		num = UserInput.nextInt();
		
		do 
		{
			i=i+1;
			remainder = num%i;
		}while(remainder != 0 && i<=7);
		
		if(remainder != 0 || num == i) 
		{
			System.out.print("The Number is Prime");
		}
		else 
		{
			System.out.print("The Number is NOT Prime");
		}
		
		
	}
}
