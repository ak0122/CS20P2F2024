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
		
		System.out.println(messageChar);
		
		int length = messageChar.length;
		System.out.println(length);
		
		ArrayList<Character> revMessage = new ArrayList<Character>();
		
		System.out.println(revMessage);
		for(int i = 0; i< messageChar.length;i++)
		{
			revMessage.add(i, (char) (message.charAt(length)-i));
		}
		
		for(int j =0; j< messageChar.length;j++)
		{
			if(revMessage.get(j) != messageChar[j])
			{
				System.out.println("Your phrase is NOT a Palindrome.");
				break;
			}
			
		}
		
	}
}
