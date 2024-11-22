/*

Program: GuessingGameA.java          Last Date of this Revision: October 19, 2024

Purpose: An guessing game where you have to guess a nu,ber between 1 and 20 with unlimited tries..

Author: Aryan K, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameA {

	public static void main(String[] args) 
	//Start with a similar outline of code as in Ch4.
	{
		//Declaration
		
				int userguess = 1,cpuguess = 0;
				
				//Prepare for user input and set up randomization
				Scanner UserInput = new Scanner(System.in);
				Random rndm = new Random();
				
				//Computer chooses a number
				cpuguess = rndm.nextInt(20)+1;
						
				//Prompt user to guess an integer b/w 1-20
				while(userguess != cpuguess)
				{
				System.out.println("Enter a number between 1 and 20: ");
				userguess = UserInput.nextInt();
				
				//If-Statement to compare user to cpu guess
				
				if (cpuguess == userguess) {
					System.out.println("You Won!");
					UserInput.close();
				}
				else {
					System.out.println("Better luck next time.");
				}
			}	
	}
	/* Screen Dump
	 Enter a number between 1 and 20: 
	12
	Better luck next time.
	Enter a number between 1 and 20: 
	15
	You Won!
	
	 
	 */
}
