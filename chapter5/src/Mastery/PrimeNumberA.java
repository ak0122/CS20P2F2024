package Mastery;

import java.util.*;

public class PrimeNumberA {

	public static void main(String[] args)
	{
		//Declaration
		int num,remainder=1,i=1;
		
		//Prepare for User Input
		Scanner UserInput = new Scanner(System.in);
		
		//Get the User to type a random Number
		System.out.print("Please Enter a Number: ");
		num = UserInput.nextInt();
		
		//keep finding the remainder when dividing num by 2-7 while the remainder is non-zero.
		do 
		{
			i+=1;
			remainder = num%i;
		}while(remainder != 0 && i<=7);
		
		//At the end if remainder is nonzero or num is equal to divisor, num is prime
		if(remainder != 0 || num == i) 
		{
			System.out.print("The Number is Prime");
		}
		//If not it is not prime
		else 
		{
			System.out.print("The Number is NOT Prime");
		}
		
		
	}
}
