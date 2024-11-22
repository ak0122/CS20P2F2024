/*

Program: MetricConversion.java          Last Date of this Revision: October 27, 2019

Purpose: An application that uses methods to convert between multiple different measurements of length.

Author: Aryan Kapoor, 
School: CHHS
Course: Computer Programming 20
 

*/

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

		System.out.print(num+ " inches equals "+df.format(cm)+ " centimeters ");
	}
	
	//method for feet to centimeters conversion
		public static void feettoCentimeters(double num)
		{
			double cm;
			DecimalFormat df = new DecimalFormat("0.00");
			
			cm = 30.48*num;

			System.out.print(num+ " feet equals "+df.format(cm)+ " centimeters ");
		}
		
		//method for Yards to Meters conversion
		public static void yardstoMeters(double num)
		{
			double m;
			DecimalFormat df = new DecimalFormat("0.00");
			
			m = 0.9144*num;

			System.out.print(num+ " yards equals "+df.format(m)+ " meters ");
		}
		
		//method for miles to kilometers conversion
				public static void milestoKilometers(double num)
				{
					double km;
					DecimalFormat df = new DecimalFormat("0.00");
					
					km = 1.6093*num;

					System.out.print(num+ " miles equals "+df.format(km)+ " kilometers ");
				}
				
				//method for Centimeters to Inches conversion
				public static void centimeterstoInches(double num)
				{
					double inch;
					DecimalFormat df = new DecimalFormat("0.00");
					
					inch = 0.393701*num;

					System.out.print(num+ " centimeters equals "+df.format(inch)+ " inches ");
				}
				
				//method for Centimeters to Feet conversion
				public static void centimeterstoFeet(double num)
				{
					double ft;
					DecimalFormat df = new DecimalFormat("0.00");
					
					ft = 0.0328084*num;

					System.out.print(num+ " centimeters equals "+df.format(ft)+ " feet ");
				}
				
				//method for Meters to Yards conversion
				public static void meterstoYards(double num)
				{
					double yd;
					DecimalFormat df = new DecimalFormat("0.00");
					
					yd = 1.09361*num;

					System.out.print(num+ " meters equals "+df.format(yd)+ " yards");
				}
				
				//method for Kilometers to Miles conversion
				public static void kilometerstoMiles(double num)
				{
					double miles;
					DecimalFormat df = new DecimalFormat("0.00");
					
					miles = 0.621371*num;

					System.out.print(num+ " kilometers equals "+df.format(miles)+ " miles ");
				}
				
				//Main Method to access relevant conversion
				public static void main(String[] args)
				{
					double measurement;
					int choice;
					
					Scanner input = new Scanner(System.in);
					
					System.out.print("Enter the measurement you want to convert: ");
					measurement = input.nextDouble();
					
					System.out.println("Choose the conversion you want to do from the following:");
					System.out.println("1. Inches to Centimeters         5. Centimeters to Inches");
					System.out.println("2. Feet to Centimeters           6. Centimeters to Feet");
					System.out.println("3. Yards to Meters               7. Yards to Meters");
					System.out.println("4. Miles to Kilometers           8. Kilometers to Miles");
					
					choice = input.nextInt();
					
					input.close();
					
					switch (choice) {
					case 1:
						inchestoCentimeters(measurement);break;
					case 2:
						feettoCentimeters(measurement);break;
					case 3:
						yardstoMeters(measurement);break;
					case 4:
						milestoKilometers(measurement);break;
					case 5:
						centimeterstoInches(measurement);break;
					case 6:
						centimeterstoFeet(measurement);break;
					case 7:
						meterstoYards(measurement);break;
					case 8:
						kilometerstoMiles(measurement);break;
					}
				}
}
/* Screen Dump
 * Case 1:
Enter the measurement you want to convert: 15
Choose the conversion you want to do from the following:
1. Inches to Centimeters         5. Centimeters to Inches
2. Feet to Centimeters           6. Centimeters to Feet
3. Yards to Meters               7. Yards to Meters
4. Miles to Kilometers           8. Kilometers to Miles
1
15.0 inches equals 38.10 centimeters 

 Case 2:
 Enter the measurement you want to convert: 178
Choose the conversion you want to do from the following:
1. Inches to Centimeters         5. Centimeters to Inches
2. Feet to Centimeters           6. Centimeters to Feet
3. Yards to Meters               7. Yards to Meters
4. Miles to Kilometers           8. Kilometers to Miles
6
178.0 centimeters equals 5.84 feet 
 */
