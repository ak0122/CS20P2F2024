/*

Program: DigitExtractor.java          Last Date of this Revision: November 26, 2024

Purpose: An application that object oriented programming to find the value of the hundreds, tens and ones of any 3-digit integer.

Author: Aryan K, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//User Enters a 3 digit integer
		System.out.println("Enter a 3-digit integer: ");
		int usernum = input.nextInt();
		
		Num number = new Num(usernum);
		
		//Start While loop to keep coming back to options until user inputs 0
			char choice = ' ';
			while(choice != 'q')
			{
				System.out.println("show (W)hole number.");
				System.out.println("show (O)nes Place number.");
				System.out.println("show (T)ens Place number.");
				System.out.println("show (H)hundreds Place number.");
				System.out.println("(Q)uit");
				
				System.out.println("Enter your Choice: ");
				choice = input.next().toLowerCase().charAt(0);
				
				//Switch statement to access the different methods in our object
				switch(choice)
				{
			  case 'w':
                  System.out.println("Whole Number: " + number.getNum());
                  break;
              case 'h':
                  System.out.println("Hundreds Digit: " + number.getHundreds());
                  break;
              case 't':
                  System.out.println("Tens Digit: " + number.getTens());
                  break;
              case 'o':
                  System.out.println("Ones Digit: " + number.getOnes());
                  break;
              case 'q':
                  System.out.println("Quitting the program.");
                  break;
              default:
                  System.out.println("Invalid command. Please try again.");
                  input.close();
			}

	
	
	}
			System.out.println("Thank you for using the program.");
}}
/*
Test Case:

Enter an integer: 
167
show (W)hole number.
show (O)nes Place number.
show (T)ens Place number.
show (H)hundreds Place number.
(Q)uit
Enter your Choice: 
w
Whole Number: 167
show (W)hole number.
show (O)nes Place number.
show (T)ens Place number.
show (H)hundreds Place number.
(Q)uit
Enter your Choice: 
o
Ones Digit: 7
show (W)hole number.
show (O)nes Place number.
show (T)ens Place number.
show (H)hundreds Place number.
(Q)uit
Enter your Choice: 
t
Tens Digit: 6
show (W)hole number.
show (O)nes Place number.
show (T)ens Place number.
show (H)hundreds Place number.
(Q)uit
Enter your Choice: 
h
Hundreds Digit: 1
show (W)hole number.
show (O)nes Place number.
show (T)ens Place number.
show (H)hundreds Place number.
(Q)uit
Enter your Choice: 
q
Quitting the program.
Thank you for using the program.
*/