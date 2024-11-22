package Skillbuilders;

import java.util.Scanner;

public class SpanishNumbers {

	public static void spanishNum(int num)
	{
		switch (num)
		{
		case 1 : System.out.print("Uno");
		case 2 : System.out.print("Dos");
		case 3 : System.out.print("Tres");
		case 4 : System.out.print("Cuatro");
		case 5 : System.out.print("Cinco");
		case 6 : System.out.print("Seis");
		case 7 : System.out.print("Siete");
		case 8 : System.out.print("Ocho");
		case 9 : System.out.print("Nueve");
		case 10 : System.out.print("Diez");
		
		}
		
}
	public static void main(System[] args)
	{
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to convert to spanish: ");
		num = input.nextInt();
		
	}
}
