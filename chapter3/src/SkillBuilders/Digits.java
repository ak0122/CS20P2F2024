package SkillBuilders;

import java.util.*;

public class Digits {


public static void main(String[] args)
{
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Please enter your two-digit number: ");
	int n = userInput.nextInt();
	
	int t = n / 10;
	int o = n % 10;
	
	System.out.print("The value of the tens is "+ t +" and the value of the ones is "+o+".");
}
}