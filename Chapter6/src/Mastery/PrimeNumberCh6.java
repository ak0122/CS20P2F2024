package Mastery;

import java.util.Scanner;

public class PrimeNumberCh6 {

	public static void isPrime(int num)
	{
		int i=1, remainder=1;
		do 
		{
			i+=1;
			remainder = num%i;
		}while(remainder != 0 && i<=7);
		
		//At the end if remainder is nonzero or num is equal to divisor, num is prime
		if(remainder != 0 || num == i)
		{
			System.out.println(true);
		}
		
		else 
		{
			System.out.println(false);
		}
	}
	
	//making main method such that user inputs the number and program goes to isPrime method
	
	public static void main(String[] args)
	{
		//Declaring number the user will enter
		int num;
		
		Scanner input = new Scanner(System.in);
		
		//Asking for user's number
		System.out.print("Enter a number to check if it is prime: ");
		num = input.nextInt();
		
		input.close();
		
		//access isPrime Method;
		
		isPrime(num);
		
	}
}
