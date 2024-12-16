/*

Program: Palindrome.java          Last Date of this Revision: December 15, 2025

Purpose: An application which tells you if a phrase is a Palindrome or not.

Author: Aryan K, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("This is the Palindrome application. You can enter a message to see if it is a Palindrome or not");
		//User enters a message
		System.out.println("Please enter a message: ");
		
		String message = input.nextLine();
		// Remove whitespace and convert message to uppercase
		message = message.replaceAll("\\W", "").toUpperCase();
		
		//convert message into an array of characters
		char[] messageChar = message.toCharArray();
		
		//declare an array list to hold characters in the reverse orderS
		ArrayList<Character> revMessage = new ArrayList<Character>();
		
		
		for(int i = messageChar.length-1; i>=0;i--)
		{
			revMessage.add(messageChar[i]) ;
		}
		
		
		boolean pdrome = false;
		
		for(int j =0; j< messageChar.length;j++)
		{
			if(revMessage.get(j) != messageChar[j])
			{
				pdrome = false;
				break;
			}
			else
			{
				pdrome = true;
			}	
		}
		
		if (pdrome == false)
		{
			System.out.print("Your message is NOT a Palindrome.");
		}
		
		else
		{
			System.out.print("The message IS a Palindrome.");
		}
	}
}
/* Screen Dump

Case 1: 
This is the Palindrome application. You can enter a message to see if it is a Palindrome or not
Please enter a message: 
Nurses run
The message IS a Palindrome.

Case 2: 
This is the Palindrome application. You can enter a message to see if it is a Palindrome or not
Please enter a message: 
Hello
Your message is NOT a Palindrome.

Case 3:
 This is the Palindrome application. You can enter a message to see if it is a Palindrome or not
Please enter a message: 
Revolver
Your message is NOT a Palindrome.

Case 4:
This is the Palindrome application. You can enter a message to see if it is a Palindrome or not
Please enter a message: 
Rotator
The message IS a Palindrome.
 */