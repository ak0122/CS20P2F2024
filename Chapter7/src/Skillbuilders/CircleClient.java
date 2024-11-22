package Skillbuilders;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleClient{

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a radius for a 2nd circle: ");
		double r = input.nextDouble();
		input.close();
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(r);
		
		System.out.println("The radius is "+c1.getRadius());
		
		Circle.displayAreaFormula();
		
		System.out.println("The area is "+ df.format(c1.area()));

		System.out.println("The circumference is " +df.format(c1.circumference()));
		
		if (c1.equals(c2))
		{
			System.out.println("The objects are equal.");
		}
		else 
		{
			System.out.println("The objects are not equal.");
		}
		
		System.out.print(c1.toString());
		
	}

}
