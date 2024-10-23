package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MetricConversion {

	//method for inches to centimeters conversion
	public static void inchestoCentimeters(double num)
	{
		double cm;
		DecimalFormat df = new DecimalFormat("0.00");
		
		cm = 2.54*num;

		System.out.print(num+ "inches equals "+df.format(cm)+ " centimeters ");
	}
	
	//method for feet to centimeters conversion
		public static void feettoCentimeters(double num)
		{
			double cm;
			DecimalFormat df = new DecimalFormat("0.00");
			
			cm = 30.48*num;

			System.out.print(num+ "feet equals "+df.format(cm)+ " centimeters ");
		}
		
		//method for Yards to Meters conversion
		public static void yardstoMeters(double num)
		{
			double m;
			DecimalFormat df = new DecimalFormat("0.00");
			
			m = 0.9144*num;

			System.out.print(num+ "yards equals "+df.format(m)+ " meters ");
		}
		
		//method for miles to kilometers conversion
				public static void milestoKilometers(double num)
				{
					double km;
					DecimalFormat df = new DecimalFormat("0.00");
					
					km = 1.6093*num;

					System.out.print(num+ "miles equals "+df.format(km)+ " kilometers ");
				}
				
				//method for Centimeters to Inches conversion
				public static void centimetertoInches(double num)
				{
					double inch;
					DecimalFormat df = new DecimalFormat("0.00");
					
					inch = 0.9144*num;

					System.out.print(num+ "centimeters equals "+df.format(inch)+ " inches ");
				}
				
				//method for Centimeters to Feet conversion
				public static void centimeterstoFeet(double num)
				{
					double ft;
					DecimalFormat df = new DecimalFormat("0.00");
					
					ft = 0.9144*num;

					System.out.print(num+ "centimeters equals "+df.format(ft)+ " feet ");
				}
				
				//method for Meters to Yards conversion
				public static void meterstoYards(double num)
				{
					double yd;
					DecimalFormat df = new DecimalFormat("0.00");
					
					yd = 0.9144*num;

					System.out.print(num+ "meters equals "+df.format(yd)+ " yards");
				}
				
				//method for Kilometers to Miles conversion
				public static void kilometerstoMiles(double num)
				{
					double miles;
					DecimalFormat df = new DecimalFormat("0.00");
					
					miles = 0.9144*num;

					System.out.print(num+ "kilometers equals "+df.format(miles)+ " miles ");
				}
}
