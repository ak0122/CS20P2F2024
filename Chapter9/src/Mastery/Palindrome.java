package Mastery;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		//enter a message
		System.out.println("Please enter a message: ");
		
		String message = input.nextLine();
		
		message = message.replaceAll("\\W", "").toUpperCase();
		
		char[] messageChar = message.toCharArray();
		
		ArrayList<Character> revMessage = new ArrayList<Character>();
		
		
		for(int i = messageChar.length-1; i>=0;i--)
		{
			revMessage.add(messageChar[i]) ;
		}
		
		System.out.println(revMessage);
		
		for(int j =0; j< messageChar.length;j++)
		{
			if(revMessage.get(j) != messageChar[j])
			{
				System.out.println("Your phrase is NOT a Palindrome.");
				break;
			}
			else
			{
				System.out.println("Your phrase IS a Palindrome.");
				break;
			}	
		}
	}
}
