<<<<<<< HEAD

/*

Program: GuessingGame.java          Last Date of this Revision: September 29, 2024

Purpose: An application that uses if-else statements to create a game where a player has to guess the correct random number between 1 and 20.

Author: Aryan Kapoor, 
School: CHHS
Course: Computer Programming 20
 

*/package Mastery;
import java.util.*;

public class GuessingGame {

	public static void main(String[] args)
	{
		//Declaration
		
		int userguess,cpuguess;
		
		//Prepare for user input and set up randomization
		Scanner UserInput = new Scanner(System.in);
		Random rndm = new Random();
				
		//Prompt user to guess an integer b/w 1-20
		System.out.print("Enter a number between 1 and 20: ");
		userguess = UserInput.nextInt();
		
		//Computer chooses a number
		
		cpuguess = rndm.nextInt(20)+1;
		
		//Print Statement to show value of user and computer guess
		System.out.print("\nComputer's Guess: "+cpuguess);
		System.out.print("\nPlayer's Guess: "+userguess);
		
		//If statement to compare user to cpu guess
		
		if (cpuguess == userguess) {
			System.out.print("\nYou Won!");
		}
		else {
			System.out.print("\nBetter luck next time.");
		}
	}
}

/* Test case 1:
Enter a number between 1 and 20: 7

Computer's Guess: 7
Player's Guess: 7
You Won!

Case 2:
Enter a number between 1 and 20: 15

Computer's Guess: 6
Player's Guess: 15
Better luck next time.
*/
=======
import java.util.*;

public class GuessingGame {

	public static void main(String[] args)
	{
		//Declaration
		
		int userguess,cpuguess;
		
		//Prepare for user input and set up randomization
		Scanner UserInput = new Scanner(System.in);
		Random rndm = new Random();
				
		//Prompt user to guess an integer b/w 1-20
		System.out.print("Enter a number between 1 and 20: ");
		userguess = UserInput.nextInt();
		
		//Computer chooses a number
		
		cpuguess = rndm.nextInt(20)+1;
		
		//Print Statement to show value of user and computer guess
		System.out.print("\nComputer's Guess: "+cpuguess);
		System.out.print("\nPlayer's Guess: "+userguess);
		
		//If statement to compare user to cpu guess
		
		if (cpuguess == userguess) {
			System.out.print("\nYou Won!");
		}
		else {
			System.out.print("\nBetter luck next time.");
		}
	}
}

/* Test case 1:
Enter a number between 1 and 20: 7

Computer's Guess: 7
Player's Guess: 7
You Won!

Case 2:
Enter a number between 1 and 20: 15

Computer's Guess: 6
Player's Guess: 15
Better luck next time.
*/
>>>>>>> branch 'master' of https://github.com/ak0122/CS20P2F2024.git
