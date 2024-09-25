package Mastery;

import java.util.Random;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args)
	{
		//declaration
		int n_1,n_2,op;
		
		//setting up user input and random number
		Random random = new Random();
		Scanner UserInput = new Scanner(System.in);
		
		op = random.nextInt(4);
		n_1 = random.nextInt(10)+1;
		System.out.print(n_1);
	}
}
