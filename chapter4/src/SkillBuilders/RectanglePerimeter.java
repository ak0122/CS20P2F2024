package SkillBuilders;

import java.util.*;

public class RectanglePerimeter 
{

	public static void main(String[] args)
	{
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter your value for length: ");
		int length = userInput.nextInt();
		
		System.out.print("Please enter your value for width: ");
		int width = userInput.nextInt();
		
		int area = length * width;
		
		System.out.print("The area of the rectangle is "+ area);
	}
}
