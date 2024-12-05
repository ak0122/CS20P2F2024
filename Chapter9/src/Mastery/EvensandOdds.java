package Mastery;

import java.util.ArrayList;
import java.util.Random;

public class EvensandOdds {
	
	public static void main(String[] args)
	{
		//Set up random numbers
		Random rand = new Random();
		
		//List for random 25 numbers
		int[] randList = new int[25];
		
		//Assign a random integer b/w 0-99 to 25 elements in the list
		for(int i=0; i < randList.length;i++)
		{
		randList[i]= rand.nextInt(100);
		}
		
		//Define 2 ArrayLists to separate the random lists into Odd and Even
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		
		//For statement to find remainder when divided by 2 and group elements into Odd or Even
		for(int element = 0; element< randList.length;element++)
		{
			int remainder = randList[element] % 2;
			
			if(remainder == 0)
			{
				evenList.add(randList[element]);
			}
			else
			{
				oddList.add(randList[element]);
			}
		}
		
		//Print the odd and even lists on one line
			System.out.println("ODD:");
			System.out.println(oddList);
			
			System.out.println("EVEN");
			System.out.println(evenList);
	}
}
