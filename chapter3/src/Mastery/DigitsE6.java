	/*

	Program: DigitsE6.java          Last Date of this Revision: 9/17/24

	Purpose: An application which tells you the value of the hundreds column, tens column and ones column when given a 3 digit integer

	Author: Aryan Kapoor, 
	School: CHHS
	Course: Computer Programming 20
	
	*/

package Mastery;

import java.util.Scanner;

public class DigitsE6 {

	public static void main(String[] args)
	{
		//Declaration
		int n, h, t, o ; 
		
		//Prep for User Input
		
		Scanner UserInput = new Scanner(System.in);
		
		//Ask for 3-digit number from User and receive the input
		System.out.print("Please enter a three digit number: ") ;
		
		n = UserInput.nextInt();
		
		//Perform int division to get the hundreds value
		
		h = n/100 ; 
		
		//Calculate the tens value
		
		t = (n-h*100)/10 ;
		
		// perform modulo division on n to get the ones value
		
		o = n%10 ;
		
		//Print the Output
		
		System.out.print("The value of the hundreds is " + h +", the value of the tens is " + t + ", and the value of the ones is " + o + ".");
		
		}
}

/* Screen Dump
 * 
Please enter a three digit number: 763
The value of the hundreds is 7, the value of the tens is 6, and the value of the ones is 3.

Please enter a three digit number: 11
The value of the hundreds is 0, the value of the tens is 1, and the value of the ones is 1.

 */

