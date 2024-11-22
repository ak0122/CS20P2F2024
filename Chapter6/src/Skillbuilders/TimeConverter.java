package Skillbuilders;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeConverter {

	public static void hourstoMinutes()
	{
		double hours, min;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Enter the number of hours: ");
		hours = input.nextDouble();
		
		min = hours*60;
		
		System.out.print(df.format(min)+" minutes.");
		input.close();
		
	}
	
	public static void daystoHours()
	{
		double days, hours;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Enter the number of days: ");
		days = input.nextDouble();
		
		hours = days*24;
		
		System.out.print(df.format(hours)+" hours.");
		input.close();
		
	}
	public static void minutestoHours()
	{
		double min, hours;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Enter the number of minutes: ");
		min = input.nextDouble();
		
		hours = min/(double)60 ;
		
		System.out.print(df.format(hours)+" hours.");
		input.close();
		
	}
	public static void hourstoDays()
	{
		double days, hours;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Enter the number of hours: ");
		hours = input.nextDouble();
		
		days = hours/24;
		
		System.out.print(df.format(days)+" days.");
		input.close();
		
	}
	
	public static void main(String[] args)
	{
		int choice;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Choose the corresponding number to access the desired conversion:");
		System.out.println("\n1: Hours to Minutes");
		System.out.println("2: Days to Hours");
		System.out.println("3: Minutes to Hours");
		System.out.println("4: Hours to Days");
		
		choice = input.nextInt();
		
		if (choice == 1)
		{
			hourstoMinutes();
		}
		else if (choice == 2)
		{
			daystoHours();
		}
		else if (choice == 3)
		{
			minutestoHours();
		}
		else
		{
			hourstoDays();
		}
		
	}
}
