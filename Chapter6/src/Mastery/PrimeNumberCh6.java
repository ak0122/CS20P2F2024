/*

Program: PrimeNumberCh6.java          Last Date of this Revision: October 29, 2024

Purpose: An application that uses a method to check whether an inputed number is prime or not.

Author: Aryan Kapoor, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Scanner;

public class PrimeNumberCh6 {

	public static String isPrime(int num)
	{
		int i=1, remainder=1;
		do 
		{
			i+=1;
			remainder = num%i;
		}while(remainder != 0 && i<=7);
		
		//At the end if remainder is nonzero or num is equal to divisor, num is prime. Exception is the number 1.
		if((remainder != 0 || num == i) && num != 1 )
		{
			
			System.out.println("The number is Prime.");
		}
		else if (num == 1)
		{
			System.out.print("The number is not Prime.");
		}
		
		else 
		{
			System.out.println("The number is not Prime.");
		}
		return null;
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
/* Screen Dump

Case 1:
Enter a number to check if it is prime: 5
The number is Prime.

Case 2:
Enter a number to check if it is prime: 15
The number is not Prime.


 
 */

